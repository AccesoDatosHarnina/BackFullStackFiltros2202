package com.example.backfullstack2201.controllers;

import com.example.backfullstack2201.modelo.Student;
import com.example.backfullstack2201.services.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.OK;
@Slf4j
@RestController
@RequestMapping("students")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//    @GetMapping("insert")
//    public boolean insertar(){
//        System.err.println("en insertar");
//        boolean respuesta=studentService.addStudent(new Student(7,"Manolito"));
//        System.out.println(studentService.getStudents());
//        log.info("sacando los estudiantes");
//        return respuesta;
//    }
//
//    @GetMapping("list")
//    public ResponseEntity<Response> getStudents(){
//        System.err.println("aqui estamos LISTANDO students");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        ResponseEntity ok= ResponseEntity.ok(
//                Response.builder()
//                        .timeStamp(now())
//                        //El boton derecho ctrl+1 me permite la bombilla para hacer importacoines estaticas
//                        //en vez de Map.of, solo of
//                        .data(Map.of("students",this.studentService.getStudents()))
//                        .message(" servers recuperados")
//                        .status(OK)
//                        .statusCode(OK.value())
//                        .build());
////        System.err.println("ok "+ok);
//        return ok;
//    }
//
//    @GetMapping("student/{id}")
//    public Student getStudentById(@PathVariable("id") int id){
//        return  this.studentService.findStudentById(id);
//    }
//
//    @PostMapping("add")
//    public void addStudent(@RequestBody Student student){
//        System.err.println("estoy aqui para poner nuevos students");
//        this.studentService.addStudent(student);
//    }
}
