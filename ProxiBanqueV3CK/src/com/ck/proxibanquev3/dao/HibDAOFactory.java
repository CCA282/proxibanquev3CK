package com.ck.proxibanquev3.dao;


public class HibDAOFactory extends AbstractDAOFactory {
	
	
	
	public DAO getConseillerDAO(){
	    return new ConseillerDAO();
	  }

	  public DAO getClientDAO(){
	    return new ClientDAO();
	  }

	  public DAO getCompteDAO(){
	    return new CompteDAO();
	  }
}
