package com.prachi.app.controller;

import com.prachi.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @GetMapping("/get/students")
    public List<Student> getStudents(){
        List listStudents= new ArrayList();
        Student student1= new Student("1","st1","4","school1");
        Student student2= new Student("2","st2","5","school2");
        Student student3= new Student("3","st3","6","school1");

        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        return  listStudents;
    }


    @GetMapping("/map/students")
    public Map mapStudents(){
        Map MapStudents= new HashMap();
        Student student1= new Student("1","abc","8","school3");
        Student student2= new Student("4","def","9","school2");
        Student student3= new Student("7","ghi","7","school1");


        MapStudents.put(student1.getRollno(),student1);
        MapStudents.put(student2.getRollno(),student2);
        MapStudents.put(student3.getRollno(),student3);
        return  MapStudents;
    }


}
