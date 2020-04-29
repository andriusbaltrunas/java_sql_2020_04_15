package com.kcs.students.app.controller;

import com.kcs.students.app.dto.StudentAddress;
import com.kcs.students.app.service.StudentAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Andrius Baltrunas
 */
@RestController
@RequestMapping("/students/addresses")
public class StudentAddressController {

	@Autowired
	private StudentAddressService studentAddressService;

	@GetMapping
	public List<StudentAddress> getStudentAddress() {
		return studentAddressService.getStudentAddress();
	}

	@GetMapping("/{studentId}/student")
	public List<StudentAddress> getStudentAddresses(@PathVariable("studentId") int studentId) {
		return studentAddressService.getStudentAddress(studentId);
	}

	@PostMapping("/{studentId}/student/save")
	public List<StudentAddress> createStudentAddress(@RequestBody StudentAddress studentAddress, @PathVariable("studentId") int studentId) {
		studentAddress.setStudentId(studentId);
		return studentAddressService.createStudentAddress(studentAddress);
	}

	@DeleteMapping("/{studentId}/student/{addressId}/delete")
	public void deleteStudentAddress(@PathVariable("studentId") int studentId, @PathVariable("addressId") int addressId) {
		studentAddressService.deleteStudentAddress(studentId, addressId);
	}
}
