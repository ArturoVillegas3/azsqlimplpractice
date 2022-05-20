package com.azsqlimplpractice.azure.Service.Impl;

import com.azsqlimplpractice.azure.Entity.Student;
import com.azsqlimplpractice.azure.Repository.StudentRepository;
import com.azsqlimplpractice.azure.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student SaveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Student GetStudentById(Integer id){
        return studentRepository.findById(id).get();
    }

    @Override
    public Student EditStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
    }
}
