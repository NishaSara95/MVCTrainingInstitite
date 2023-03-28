package com.studentmanagement.system;


import com.studentmanagement.entity.Student;
import com.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystemApplication implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;

    public void run(String... args) throws Exception {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student();
        student1.setId(52L);
        student1.setFirstName("Nisha");
        student1.setLastName("Rajendran");
        student1.setEmail("nisha@gmail.com");

        Student student2 = new Student();
        student2.setId(53L);
        student2.setFirstName("Saravanan");
        student2.setLastName("Sri");
        student2.setEmail("sara@gmail.com");

        Student student3 = new Student();
        student3.setId(54L);
        student3.setFirstName("Tarun");
        student3.setLastName("Vijay");
        student3.setEmail("tarun@gmail.com");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);


    }
}

