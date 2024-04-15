package org.mjulikelion.likelion12thspringboot.repository;

import org.mjulikelion.likelion12thspringboot.Student;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private final List<Student> studentList = new ArrayList<>();

    public List<Student> getALLStudentList() {
        return this.studentList;
    }

    public Student getStudentById(String id) {
        for (Student student : this.studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student Not Found");
    }

    public void updateStudentById(String id, String name) {
        for (Student s : this.studentList) {
            if (s.getId().equals(id)) {
                this.studentList.remove(s);
                this.studentList.add(new Student(id, name));
                return;
            }
        }
        throw new IllegalArgumentException("Student Not Found");
    }

    public void createStudent(Student student) {
        for (Student s : this.studentList) {
            if (s.getId().equals(student.getId())) {
                throw new IllegalArgumentException("Student Already Exist");
            }
        }
        this.studentList.add(student);
    }

    public void deleteStudentById(String id) {
        for (Student student : this.studentList) {
            if (student.getId().equals(id)) {
                this.studentList.remove(student);
                return;
            }
        }
        throw new IllegalArgumentException("Student not found");
    }

}
