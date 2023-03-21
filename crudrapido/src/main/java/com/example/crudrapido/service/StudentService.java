package com.example.crudrapido.service;

import com.example.crudrapido.entity.Student;
import com.example.crudrapido.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public List<Student> getStudent(Long id){
        return studentRepository.findAll();
    }

}

    //docker run --name crudRapido-container -e MYSQL_ROOT_PASSWORD=123456 -v C:\\Docker\\mysql-crudRapido:/var/lib/mysql -p 3306:3306 -d mysql


