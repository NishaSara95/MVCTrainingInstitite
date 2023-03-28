package com.studentmanagement.controller;


import com.studentmanagement.entity.Student;
import com.studentmanagement.service.StudentService;
import com.studentmanagement.service.impl.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@Slf4j
public class StudentController {

    @Autowired
    StudentService studentService;

    // Method to handle list students and return mode and view
    @GetMapping("/students")
    public String listStudents(Model model) {
        log.info("Into Student controller.listStudents ");
        model.addAttribute("students", studentService.getAllStudents());
        return "students";

    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        log.info("Into Student controller.createStudentForm");
        // Create an empty obj to hold student form data
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    // To bind Student table
    public String saveStudent(@ModelAttribute("student") Student student) {
        log.info("Into Student controller.saveStudent");
        studentService.save(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        log.info("Into Student controller.editStudentForm");
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute Student student, Model model) {
        log.info("Into Student controller.updateStudent");
        // get student from Db by id
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(student.getId());
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        //save updated student object
        studentService.updateStudent(existingStudent);
        return "redirect:/students";

    }
    // Handler method to handle delete student request
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        log.info("Into Student controller.deleteStudent");
        studentService.deleteStudentById(id);
        return "redirect:/students";

    }
}
