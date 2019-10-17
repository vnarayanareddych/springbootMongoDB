package com.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {

}
