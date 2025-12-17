package com.example.demo.serviceImpl;
import java.util.List;

import org.springFramework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Student;

@service
public class StudentServiceImpl implements StudentService{
    @Autowired
    Studentrepository repo;
   

    @Override

    public Student createData(Student stu){
        return repo.save(stu);
    }
}