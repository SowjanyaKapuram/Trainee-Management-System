package com.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.dao.TraineeDao;

import com.model.Trainee;

@Component("products1")
@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao dao;
	
	@Override
	public int addTrainee(Trainee trainee) {
		return dao.addTrainee(trainee);
			}
	@Override
	public int deleteTrainee(int id) {
		return dao.deleteTrainee(id);
	}
	@Override
	public int modifyTrainee(Trainee trainee) {
		return dao.modifyTrainee(trainee);
	}
	@Override
	public Trainee retrieveTrainee(int id) {
		return dao.retrieveTrainee(id);
	}
	@Override
	public ArrayList<Trainee> retrieveAllTrainees() {
		return dao.retrieveAllTrainees();
	}

}
