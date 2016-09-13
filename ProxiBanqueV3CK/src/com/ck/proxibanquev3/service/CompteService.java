package com.ck.proxibanquev3.service;

import javax.inject.Inject;

import com.ck.proxibanquev3.dao.CompteDAO;
import com.ck.proxibanquev3.domaine.Compte;
import com.ck.proxibanquev3.domaine.Courant;
import com.ck.proxibanquev3.domaine.Epargne;

/**
 * Classe du domaine service qui concerne l'ensemble des services Comptes. Cette
 * classe va permettre de: modifier, supprimer, creer, lire un Compte Courant et ou Epargne
 * @author Clement et Karim
 */
public class CompteService {
	
	@Inject
	CompteDAO compteDAO;
	
	/**
	 * M�thode permettant de cr�er un compte Courant dans la base de donn�e
	 * @param courant Le compte courant que l'on souhaite cr�er
	 * @return Retourne un bool�en: true si tout se d�roule sans problemes sinon
	 *         false. (bool�en)
	 */
	public boolean creerCompteCourant(Courant courant){
		compteDAO.createCourant(courant);
		return true;
	}
	
	/**
	 * m�thode permettant de cr�er un Compte Epargne dans la base de donn�e
	 * @param epargne Le compte Epargne que l'on souhaite cr�er
	 * @return Retourne un bool�en: true si tout se d�roule sans problemes sinon
	 *         false. (bool�en)
	 */
	public boolean creerCompteEpargne(Epargne epargne){
		compteDAO.createEpargne(epargne);
		return true;
	}
	
	/**
	 * Permet d'obtenir les informations d'un compte Epargne en base de donn�e
	 * @param iDCompte Le num�ro de compte Epargne
	 * @return objet Epargne
	 */
	public Epargne lireEpargne(int idCompte){
		Epargne epargne = null;
		return epargne;
	}
	
	/**
	 * Permet d'obtenir les informations d'un compte Courant en base de donn�e
	 * @param iDCompte Le num�ro de compte Courant
	 * @return objet Courant
	 */
	public Courant lireCourant(int idCompte){
		Courant courant = null;
		return courant;
	}
	
	/**
	 * Permet de cr�diter un compte bancaire
	 * @param compteC le compte � cr�diter
	 * @param montant le montant � cr�diter sur le compte
	 * @return
	 */
	public boolean crediter(Compte compteC, double montant){
		double majSolde =(compteC.getSolde() + montant);
		compteC.setSolde(majSolde);
		compteDAO.updateCompte(compteC);
		return true;
	}
	
	/**
	 * Permet de d�biter un compte bancaire
	 * @param compteD compte � d�biter
	 * @param montant le montant � d�biter sur le compte
	 * @return
	 */
	public boolean debiter(Compte compteD, double montant){
		double majSolde =(compteD.getSolde() - montant);
		compteD.setSolde(majSolde);
		compteDAO.updateCompte(compteD);
		return true;
	}
	
	/**
	 * Permet d'effectuer un virement entre deux comptes bancaires
	 * @param compteD Le compte devant �tre d�bit�
	 * @param compteC Le compte devant �tre cr�dit�
	 * @param montant Le montant du virement
	 * @return False si le virement a �chou�, true si le virement a r�ussi
	 */
	public boolean virement(Compte compteD, Compte compteC, double montant){
		crediter(compteC, montant);
		debiter(compteD, montant);
		return true;
	}

}
