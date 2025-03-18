package org.example.c0928316_assignment_4.Service;

import org.example.c0928316_assignment_4.Entity.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final List<Student> students = new ArrayList<>();
    private Integer idCounter = 1;

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(Student student) {
        student.setId(idCounter++);
        students.add(student);
    }

    public void deleteStudentById(Integer id) {
        students.removeIf(student -> student.getId().equals(id));
    }
}