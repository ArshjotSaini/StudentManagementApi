package com.example.StudentManagementApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagementApi.model.students;

public interface StudentManagementApiRepository extends JpaRepository<students, Long> {
}
