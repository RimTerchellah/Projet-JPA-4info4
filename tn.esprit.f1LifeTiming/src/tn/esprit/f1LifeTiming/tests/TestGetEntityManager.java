package tn.esprit.f1LifeTiming.tests;

import javax.persistence.EntityManager;

import tn.esprit.f1LifeTiming.entities.Car;
import tn.esprit.f1LifeTiming.technique.JpaUtil;

public class TestGetEntityManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManager entityManager = JpaUtil.getEntityManager();
		try {
			entityManager.getTransaction().begin();

			Car car = new Car();
			car.setDriverCar("Ronaldo");

			entityManager.persist(car);

			entityManager.getTransaction().commit();

		} catch (Exception e) {

			entityManager.getTransaction().rollback();
		}

	}

}
