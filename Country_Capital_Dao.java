package org.jsp.onetoone_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetoone_uni.dto.Capital;
import org.jsp.onetoone_uni.dto.Country;

//import Org.jsp.laptop_wala.dto.Laptop;


public class Country_Capital_Dao {
	
	public void saveCapital(Capital capital) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	transaction.begin();
	manager.persist(capital);
	transaction.commit();
	
	}
	
	public void saveCountry(Country country) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(country);
		transaction.commit();
		
		}
	
	public void updateCapital(Capital capital) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.merge(capital);
		transaction.commit();
		
		}
	
	public void updateCountry(Country country) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.merge(country);
		transaction.commit();
		
		}
	
	public void findCountryById(int count_id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		Country country = entityManager.find(Country.class, count_id);
		if(country!=null) {
			System.out.println(country);
		}else {
			System.out.println("element is not found");
		}
	
	}
	
	public void findCapitalById(int capitalid) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		Capital capital = entityManager.find(Capital.class, capitalid);
		if(capital!=null) {
			System.out.println(capital);
		}else {
			System.out.println("element is not found");
		}
	
	}
	
	public void deleteCountryById(int count_id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		
		Country country = entityManager.find(Country.class, count_id);
		if(country!=null) {
			transaction.begin();
			entityManager.remove(country);
			transaction.commit();
		}else {
			System.out.println("element is not found");
		}
	
	}
	
	public void deleteCapitalById(int capitalId) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		
		Capital capital = entityManager.find(Capital.class, capitalId);
		if(capital!=null) {
			transaction.begin();
			entityManager.remove(capital);
			transaction.commit();
		}else {
			System.out.println("element is not found");
		}
	
	}
	
	public void fetchAllCountry() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select c from Country c");
		List<Country> country = query.getResultList();
		
		for (Country countri : country) {
			System.out.println(countri.getName());
		}
	}
	
	public void fetchAllCapital() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select c from Capital c");
		List<Capital> capital = query.getResultList();
		
		for (Capital cap : capital) {
			System.out.println(cap.getCapitalName());
		}
	}
}
