package com.ck.proxibanquev3.service;



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
	
	
	CompteDAO compteDAO=new CompteDAO();
	
	/**
	 * M�thode permettant de cr�er un compte Courant dans la base de donn�e
	 * @param courant Le compte courant que l'on souhaite cr�er
	 * @return Retourne un bool�en: true si tout se d�roule sans problemes sinon
	 *         false. (bool�en)
	 */
	public boolean creerCompteCourant(Courant courant){
		boolean status = compteDAO.createCourant(courant);
		return status;
	}
	
	/**
	 * m�thode permettant de cr�er un Compte Epargne dans la base de donn�e
	 * @param epargne Le compte Epargne que l'on souhaite cr�er
	 * @return Retourne un bool�en: true si tout se d�roule sans problemes sinon
	 *         false. (bool�en)
	 */
	public boolean creerCompteEpargne(Epargne epargne){
		boolean status = compteDAO.createEpargne(epargne);
		return status;
	}
	
	/**
	 * Permet d'obtenir les informations d'un compte Epargne en base de donn�e
	 * @param iDCompte Le num�ro de compte Epargne
	 * @return objet Epargne
	 */
	public Epargne lireEpargne(int idCompte){
		Epargne epargne = (Epargne) compteDAO.findById(idCompte);
		return epargne;
	}
	
	/**
	 * Permet d'obtenir les informations d'un compte Courant en base de donn�e
	 * @param iDCompte Le num�ro de compte Courant
	 * @return objet Courant
	 */
	public Courant lireCourant(int idCompte){
		Courant courant = (Courant) compteDAO.findById(idCompte);
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
		boolean status = compteDAO.updateCompte(compteC);
		return status;
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
		boolean status = compteDAO.updateCompte(compteD);
		return status;
	}
	
	/**
	 * Permet d'effectuer un virement entre deux comptes bancaires
	 * @param compteD Le compte devant �tre d�bit�
	 * @param compteC Le compte devant �tre cr�dit�
	 * @param montant Le montant du virement
	 * @return False si le virement a �chou�, true si le virement a r�ussi
	 */
	public boolean virement(Compte compteD, Compte compteC, double montant){
		boolean booleanC = crediter(compteC, montant);
		boolean booleanD = debiter(compteD, montant);
		
	if(booleanC == true && booleanD == true){
		return true;
	}else
		return false;
	}

}


