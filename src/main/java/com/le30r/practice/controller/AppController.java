package com.le30r.practice.controller;

import com.le30r.practice.config.MainConfig;
import com.le30r.practice.model.Student;
import com.le30r.practice.model.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {
    ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);


    @RequestMapping("/teacher")
    public Teacher getTeacher() {
        return context.getBean("Mike teacher", Teacher.class);
    }

    @RequestMapping("/student")
    public Student getStudent() {
        return context.getBean("John student", Student.class);
    }



}
