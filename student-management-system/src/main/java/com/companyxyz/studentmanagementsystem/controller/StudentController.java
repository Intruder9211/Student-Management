package com.companyxyz.studentmanagementsystem.controller;

import com.companyxyz.studentmanagementsystem.model.Student;
import com.companyxyz.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * Create a new student.
     *
     * @param student The student object to be created.
     * @return The created student object.
     */
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    /**
     * Retrieve all students.
     *
     * @return List of all student objects.
     */
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    /**
     * Retrieve a student by ID.
     *
     * @param id The ID of the student to retrieve.
     * @return The student object with the specified ID.
     */
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    /**
     * Update a student by ID.
     *
     * @param id The ID of the student to update.
     * @param student The updated student object.
     * @return The updated student object.
     */
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    /**
     * Delete a student by ID.
     *
     * @param id The ID of the student to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
    }
}

