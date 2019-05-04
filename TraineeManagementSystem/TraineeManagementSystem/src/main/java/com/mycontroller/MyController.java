package com.mycontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.model.Trainee;
import com.service.TraineeService;

@RestController
public class MyController {
	
	@Autowired
	TraineeService traineeService;
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	@PostMapping("/add")
	public ResponseEntity addData(@RequestBody Trainee trainee) {
		traineeService.addTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}

	@PutMapping("/modify")
	public ResponseEntity modifyData(@RequestBody Trainee trainee) {
		traineeService.modifyTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity deleteData(@RequestBody int id) {
		traineeService.deleteTrainee(id);
		return new ResponseEntity(HttpStatus.OK);
		
	}
	@GetMapping("/retrieve")
	public Trainee getByPid(@RequestBody int id) {
		Trainee trainee=traineeService.retrieveTrainee(id);
		return trainee;
	}

	@GetMapping("/retrieveAll")
	public ArrayList<Trainee> getAllProducts(){
		ArrayList<Trainee> trainees = traineeService.retrieveAllTrainees();
		return trainees;
	}
}
