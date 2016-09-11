package com.ck.proxibanquev3.dao;

public abstract class AbstractDAOFactory {

	public static final int Hib_DAO_FACTORY = 0;

	//Retourne un objet ConseillerDAO interagissant avec la BDD
	public abstract DAO getConseillerDAO();
	   
	//Retourne un objet ClientDAO interagissant avec la BDD
	public abstract DAO getClientDAO();
	   
	//Retourne un objet CompteDAO interagissant avec la BDD
	public abstract DAO getCompteDAO();
	   
	//Méthode permettant de récupérer les Factory
	public static AbstractDAOFactory getFactory(int type){
	  switch(type){
	    case Hib_DAO_FACTORY:
	      return new HibDAOFactory();
	    default:
	    	return null;
	    }
	  }
	}
