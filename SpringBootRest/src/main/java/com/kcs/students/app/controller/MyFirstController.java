package com.kcs.students.app.controller;

import com.kcs.students.app.dto.Pet;
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
@RequestMapping("/myExample")
public class MyFirstController {

	@GetMapping("/sayHi")
	public String sayHi() {
		return "Hello";
	}

	@GetMapping("/sayHi/{myName}")
	public String sayHi(@PathVariable("myName") String name) {
		return "Hello " + name;
	}

	@GetMapping("/pets")
	public List<Pet> getPets(){
		return List.of(new Pet("Pukis", 25, "Cat"),
					   new Pet("Batonas", 15 ,"Dot"));
	}

	@PostMapping("/pets/save")
	public Pet savePet(@RequestBody Pet pet){
		pet.setName(pet.getName() + "_new");
		return pet;
	}
}
