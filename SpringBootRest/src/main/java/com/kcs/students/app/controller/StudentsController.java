package com.kcs.students.app.controller;

import com.kcs.students.app.dto.Student;
import com.kcs.students.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Andrius Baltrunas
 */
@RestController
@RequestMapping("/students")
public class StudentsController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

	@GetMapping("/{id}/student")
	public Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudent(id);
	}

	@PostMapping("/save")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@DeleteMapping("/{id}/student/delete")
	public void deleteStudent(@PathVariable("id") int id){
		studentService.deleteStudent(id);
	}

	@PutMapping("/{id}/student/update")
	public Student updateStudent(@PathVariable("id") int id, @RequestBody Student student) {
		student.setId(id);
		return studentService.updateStudent(student);
	}
}
