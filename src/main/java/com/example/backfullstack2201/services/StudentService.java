package com.example.backfullstack2201.services;

import com.example.backfullstack2201.modelo.Student;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import java.util.stream.Stream;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<Student>();


    //no debemos tocar el constructor
    //criterios para hacer la buscqueda: aportacion, valoracion, edad
    @PostConstruct
    public void populateStudents() {
        students.add(new Student(1, "Felipe",1200,5f,23));
        students.add(new Student(2, "Antoni",1500,6f,18));
        students.add(new Student(3, "Cesar",800,2f,53));
        students.add(new Student(4, "Josep",2222,9f,32));
        students.add(new Student(5, "Eneko",33333,3f,54));
        students.add(new Student(6, "Walter",44444,7f,14));
        students.add(new Student(7, "Jason",3333,3f,25));
        students.add(new Student(8, "Antonello",8888,5f,34));
        students.add(new Student(9, "Julio",5555,4f,22));
        students.add(new Student(10, "Pepe",33333,7f,21));
    }

    public List<Student> getStudents() {
        return students;
    }

    //el service accede al repo
    //primero hay un filtro obligatorio con un campo seleccionado por nosotros. Todas las busquedas
    //deben llevar ese criterio, por ejemplo valoracion o precio en el caso de lso moviles
//    private Stream<List<Student>> getMainFilter(Filter filter){
//    students.stream().filter(new Predicate<Student>() {
//        @Override
//        public boolean test(Student student) {
//            return false;
//        }
//    })
//    }
}
