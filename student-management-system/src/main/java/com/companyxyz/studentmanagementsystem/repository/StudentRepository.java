package com.companyxyz.studentmanagementsystem.repository;

import com.companyxyz.studentmanagementsystem.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}

