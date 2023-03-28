package com.studentmanagement.service;

import com.studentmanagement.entity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;


public interface StudentService {

    List<Student> getAllStudents();

    Student save(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
