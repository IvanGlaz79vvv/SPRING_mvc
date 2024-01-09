package org.example.spring_mvc;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {
    private StudentRepository repository;

    @Autowired
    public void setRepository(StudentRepository repository) {
        this.repository = repository;
    }
    public void saveStudent(Student student){
        repository.save(student);
    }
}
