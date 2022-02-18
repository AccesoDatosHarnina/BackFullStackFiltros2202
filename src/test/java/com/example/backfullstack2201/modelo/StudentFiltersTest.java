package com.example.backfullstack2201.modelo;

import com.example.backfullstack2201.services.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentFiltersTest {


    @Test
    void chargeFilters() {
        StudentService studentService=new StudentService();
        StudentFilters studentFilters=new StudentFilters();
        Map<String,Range> mapaFiltros=new HashMap<>();
        mapaFiltros.put("aportacion",new Range(3000,5000));
        List<Student> students = studentFilters.chargeFilters(mapaFiltros, studentService.getStudents());
        System.out.println(students);
    }
}