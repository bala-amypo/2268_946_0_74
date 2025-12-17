package com.example.demo.serviceImpl;
import java.util.List;

import org.springFramework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Student;
import com.example.demo.repository.Studentrepository;
import com.example.demo.service.Studentservice;
import org.springframework.stereotype.repository;


@service
public class StudentServiceImpl implements StudentService{
    @Autowired
    Studentrepository repo;
   

    @Override

    public Student createData(Student stu){
        return repo.save(stu);
    }

    @Override
    public List<student>fetchRecord(){
         return repo.findAll();        

    }
    

}