package com.ck.proxibanquev3.dao;

import javax.persistence.Entity;

import com.ck.proxibanquev3.domaine.Conseiller;

@Entity
public class ConseillerDAO extends DAO<Conseiller> {
	
	public ConseillerDAO(){
		super();
	}

	@Override
	public boolean create(Conseiller obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Conseiller obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Conseiller obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Conseiller findById(int id) {
		Conseiller conseiller = new Conseiller();
			return conseiller;
	}
	
	public Conseiller readByLogin(String login) {
		Conseiller conseiller = new Conseiller();
			return conseiller;
	}
	
	public String getExpectedPass(String login){
		// comparer login r�cup et login DB.
		String expectedpass = null;
		return expectedpass;
	}
}
