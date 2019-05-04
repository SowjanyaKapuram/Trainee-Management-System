package com.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.model.Trainee;
@Component("dao")
@Repository
@ComponentScan("com")
public class TraineeDaoImpl implements TraineeDao{
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public int addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
		return 0;
	}
	@Override
	public int deleteTrainee(int id) {
		Trainee trainee =new Trainee();
		trainee.setTraineeId(id);
		entityManager.remove(entityManager.contains(trainee) ? trainee : entityManager.merge(trainee));
		return 0;
			}
	@Override
	public int modifyTrainee(Trainee trainee) {
		entityManager.merge(trainee);
		return 0;
	}
	@Override
	public Trainee retrieveTrainee(int id) {
		Trainee trainee=entityManager.find(Trainee.class, id);
		return trainee;
	
	}
	@Override
	public ArrayList<Trainee> retrieveAllTrainees() {
		Query query = (Query) entityManager.createQuery("from Trainee ");
		ArrayList<Trainee> list = (ArrayList<Trainee>) query.list();
		return list;
	}

}
