package com.le30r.practice.config;

import com.le30r.practice.model.Student;
import com.le30r.practice.model.Teacher;
import com.le30r.practice.model.Title;
import org.springframework.context.annotation.Bean;

import java.util.Calendar;
import java.util.Date;

public class MainConfig {
    @Bean("John student")
    public Student getStudent() {
        Student student = new Student("John", new Date(2001, Calendar.APRIL, 25), 1,
                "mail@mail.ru", "12345", "Moscow");
        student.setAdmission(new Date(2019, Calendar.SEPTEMBER, 1));
        student.setGroup(945);
        student.setFaculty("FIT");
        student.setSpecialty("Computer Science");
        return student;
    }

    @Bean("Mike teacher")
    public Teacher getTeacher() {
        Teacher teacher = new Teacher("Mike", new Date(2001, Calendar.APRIL, 25), 1,
                "teacher@mail.ru", "12345", "Moscow");
        teacher.setTitle(Title.DOCENT);
        teacher.setDepartment("Computer Science");
        return teacher;
    }
}
