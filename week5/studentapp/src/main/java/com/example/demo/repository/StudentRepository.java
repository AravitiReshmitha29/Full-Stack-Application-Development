package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.student;

@Repository
public interface StudentRepository extends JpaRepository<student, Long> {

    // 🔹 Find students by department
    List<student> findByDepartment(String department);

    // 🔹 Find students by age greater than given value
    List<student> findByAgeGreaterThan(int age);

    // 🔹 Find students by name
    List<student> findByName(String name);

}