package com.example.StudentManagementApi.controller;

import com.example.StudentManagementApi.model.students;
import com.example.StudentManagementApi.repository.StudentManagementApiRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentManagementApiController {

    @Autowired
    private StudentManagementApiRepository userRepository;

    // Get all students
    @GetMapping("/get/students")
    public List<students> getAllUsers() {
        return userRepository.findAll();
    }

    // Add a new student
    @PostMapping("/create/students")
    public students createStudent(@RequestBody students student) {
        return userRepository.save(student);
    }
    
 // Delete a student by ID
    @DeleteMapping("/delete/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        Optional<students> student = userRepository.findById(id);
        if(student.isPresent()) {
            userRepository.deleteById(id);
            return "Student with ID " + id + " has been deleted.";
        } else {
            return "Student with ID " + id + " not found.";
        }
    }
        
     // Update a student by ID
        @PutMapping("/update/students/{id}")
        public String updateStudent(@PathVariable Long id, @RequestBody students updatedStudent) {
            Optional<students> student = userRepository.findById(id);
            if(student.isPresent()) {
                students existingStudent = student.get();
                existingStudent.setFirstName(updatedStudent.getFirstName());
                existingStudent.setEmail(updatedStudent.getEmail());
                existingStudent.setLastName(updatedStudent.getLastName());
                   
                userRepository.save(existingStudent);
                return "Student with ID " + id + " has been updated.";
            } else {
                return "Student with ID " + id + " not found.";
            }
    }
}

