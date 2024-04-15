package org.mjulikelion.likelion12thspringboot.service;

import lombok.AllArgsConstructor;
import org.mjulikelion.likelion12thspringboot.Student;
import org.mjulikelion.likelion12thspringboot.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return this.studentRepository.getALLStudentList();
    }

    public Student getStudentById(String id) {
        return studentRepository.getStudentById(id);
    }

    public void createStudent(Student student) {
        studentRepository.createStudent(student);
    }

    public void deleteStudentById(String id) {
        studentRepository.deleteStudentById(id);
    }

    public void updateStudentById(String id, String name) {
        studentRepository.updateStudentById(id, name);
    }
}
