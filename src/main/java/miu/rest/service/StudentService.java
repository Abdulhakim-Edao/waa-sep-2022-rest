package miu.rest.service;

import miu.rest.model.Course;
import miu.rest.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    void save(Student s);

    void put(int id, Student s);

    List<Student> findAll();

    Student findById(int id);

    void delete(int id);

    List< Student > getStudentsByMajor(String major);

    List<Course> getCoursesByStudentId(int studentId);
}
