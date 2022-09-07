package miu.rest.service.impl;

import miu.rest.model.Course;
import miu.rest.model.Student;
import miu.rest.repositories.StudentRepo;
import miu.rest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void save(Student s){
        studentRepo.add(s);
    }

    @Override
    public void put(int id, Student s) {

        studentRepo.put(id, s);
    }

    @Override
    public List<Student> findAll(){
        return studentRepo.getStudents();
    }

    @Override
    public Student findById(int id) {
        return studentRepo.findById(id);
    }

    @Override
    public void delete(int id) {
        studentRepo.deleteById(id);

    }



    @Override
    public List<Course> getCoursesByStudentId(int id) {
        return studentRepo.getCoursesByStudentId(id);
    }
    @Override
    public List<Student> getStudentsByMajor(String major) {
        return studentRepo.getStudentsByMajor(major);
    }
}
