package com.ck.proxibanquev3.dao;

import javax.inject.Inject;

public class HibDAOFactory extends AbstractDAOFactory {  

	@Inject
	ConseillerDAO conseillerDAO;
	ClientDAO clientDAO;
	CompteDAO compteDAO;
	
	//Retourne un objet ConseillerDAO interagissant avec la BDD
	public DAO getConseillerDAO(){
	    return conseillerDAO;
	  }

	//Retourne un objet ClientDAO interagissant avec la BDD
	  public DAO getClientDAO(){
	    return clientDAO;
	  }

	//Retourne un objet CompteDAO interagissant avec la BDD
	  public DAO getCompteDAO(){
	    return compteDAO;
	  }
}
