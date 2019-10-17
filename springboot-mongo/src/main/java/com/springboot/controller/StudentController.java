package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Student;
import com.springboot.repository.StudentRepository;

@RestController
@RequestMapping("students")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@PostMapping("/addStudent")
	public String saveStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return "Added Student with id :" + student.getId();
	}

	@GetMapping("/findAllStudents")
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	@GetMapping("/findAllStudents/{id}")
	public Optional<Student> getStudent(@PathVariable int id) {
		return studentRepository.findById(id);
	}

	@DeleteMapping("/deleteStudent/{id}")
	public String deleteBook(@PathVariable int id) {
		studentRepository.deleteById(id);
		return "student delete with id :" + id;
	}
}
