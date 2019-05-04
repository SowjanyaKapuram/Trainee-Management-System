package com.dao;

import java.util.ArrayList;


import com.model.Trainee;

public interface TraineeDao {

	int addTrainee(Trainee trainee);
	int deleteTrainee(int id);
	int modifyTrainee(Trainee trainee);
	Trainee retrieveTrainee(int id);
	ArrayList<Trainee> retrieveAllTrainees();

}
