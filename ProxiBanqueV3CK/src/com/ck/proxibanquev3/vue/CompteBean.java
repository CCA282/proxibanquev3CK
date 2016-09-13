package com.ck.proxibanquev3.vue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ck.proxibanquev3.dao.CompteDAO;
import com.ck.proxibanquev3.domaine.Compte;
import com.ck.proxibanquev3.domaine.Courant;
import com.ck.proxibanquev3.service.CompteService;




/**
 * Bean managé pour la gestion des comptes
 * @author Clement et Karim
 *
 */
public class CompteBean implements Serializable {

	CompteService compteService=new CompteService();
	CompteDAO compteDAO=new CompteDAO();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private double solde;
	private int idSource;
	private int idDestination;
	private double montant;
	
			

	private List<Compte> comptes = new ArrayList<Compte>() {
		/**
		* 
		*/
		private static final long serialVersionUID = 1L;

		{
			addAll(compteDAO.getAllCompte());
//			add(new Comptes(1, 320));
//			add(new Comptes(2, 320));
		}
	};

	/**
	 * 
	 */
	public CompteBean() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return the comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * @return the idSource
	 */
	public int getIdSource() {
		return idSource;
	}

	/**
	 * @param idSource the idSource to set
	 */
	public void setIdSource(int idSource) {
		this.idSource = idSource;
	}

	/**
	 * @return the idDestination
	 */
	public int getIdDestination() {
		return idDestination;
	}

	/**
	 * @param idDestination the idDestination to set
	 */
	public void setIdDestination(int idDestination) {
		this.idDestination = idDestination;
	}

	/**
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	public String virement(){
		Compte compteS=compteDAO.findById(idSource);
		Compte compteD=compteDAO.findById(idDestination);
		compteService.virement(compteS,compteD,this.montant);
		this.comptes=new ArrayList<Compte>() {
			/**
			* 
			*/
			private static final long serialVersionUID = 1L;

			{
				addAll(compteDAO.getAllCompte());
			}
		};
		return "/30virement.xhtml";
	}


}
