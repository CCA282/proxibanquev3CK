package com.ck.proxibanquev3.dao;

import com.ck.proxibanquev3.domaine.Client;

public class ClientDAO extends DAO<Client> {

	public ClientDAO() {	
	}

	@Override
	public boolean create(Client obj) {
		tx.begin();
		em.persist(obj);
		tx.commit();
		
		em.close();
		emf.close();
		return false;
	}

	@Override
	public boolean delete(Client obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Client obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Client findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
