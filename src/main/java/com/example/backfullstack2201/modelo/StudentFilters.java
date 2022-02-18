package com.example.backfullstack2201.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentFilters {

    HashMap<String, Filter> filtros;

    public StudentFilters() {
        filtros = new HashMap<>();
        filtros.put("aportacion", new Filter<Float, Stream<Student>>() {
            @Override
            public Stream<Student> filtering(Stream<Student> studentStream) {
                return studentStream.filter(student ->
                    student.getAportacion() > getMinimum() && student.getAportacion() < getMaximum());
            }
        });
        filtros.put("valoracion", new Filter<Float, Stream<Student>>() {
            @Override
            public Stream<Student> filtering(Stream<Student> studentStream) {
                return studentStream.filter(student ->

                        student.getValoracion() > getMinimum() && student.getValoracion() < getMaximum());
            }
        });
        filtros.put("edad", new Filter<Integer, Stream<Student>>() {
            @Override
            public Stream<Student> filtering(Stream<Student> studentStream) {
                return studentStream.filter(student -> student.getEdad() > getMinimum() && student.getEdad() < getMaximum());
            }
        });
    }

    public List<Student> chargeFilters(Map<String, Range> filters, List<Student> list) {
        Stream<Student> stream = list.stream();
        for (String filtro : filters.keySet()) {
            if (filters.containsKey(filtro)) {
                Filter filter = filtros.get(filtro);
                filter.setRange(filters.get(filtro));
                stream = applyFilter(stream, filter);
            }
        }
        return stream.collect(Collectors.toList());
    }

    private Stream<Student> applyFilter(Stream<Student> stream, Filter filter) {
        return (Stream<Student>) filter.filtering(stream);
    }

    public Stream<List<Student>> filterStudents(Stream<List<Student>> stream) {
        for (String filtro : filtros.keySet()) {
            stream = stream.filter((Predicate<? super List<Student>>) filtros.get(filtro).filtering(stream));
        }
        return stream;
    }


}
