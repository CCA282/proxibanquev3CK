package com.ck.proxibanquev3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public abstract class DAO<T> {
	
	protected static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");   
	protected static final EntityManager em = emf.createEntityManager();
	protected static final EntityTransaction tx = em.getTransaction();
	
	public DAO() {
	}

	/**
	  * Méthode de création
	  * @param obj
	  * @return boolean 
	  */
	  public abstract boolean create(T obj);

	  /**
	  * Méthode pour effacer
	  * @param obj
	  * @return boolean 
	  */
	  public abstract boolean delete(T obj);

	  /**
	  * Méthode de mise à jour
	  * @param obj
	  * @return boolean
	  */
	  public abstract boolean update(T obj);

	  /**
	  * Méthode de recherche des informations
	  * @param id
	  * @return T
	  */
	  public abstract T findById(int id);
}
