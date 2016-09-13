package com.ck.proxibanquev3.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ck.proxibanquev3.domaine.Compte;
import com.ck.proxibanquev3.domaine.Courant;
import com.ck.proxibanquev3.domaine.Epargne;

/**
 * Classe CompteDAO, permet la gestion des Comptes en base
 * 
 * @author Clement et Karim
 *
 */
public class CompteDAO {
	
	/**
	 * M�thode permettant la cr�ation en base d'un nouveau compte Courant
	 * 
	 * @param courant
	 *            L'objet Courant qui va �tre cr�e dans la base de donn�e (objet Courant)
	 * @return Retourne true si la m�thode se d�roule bien sinon retourne false (bool�en)
	 */
	public boolean createCourant(Courant courant) {
		// Ouverture de l'unit� de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean status = true;

		try {
			// Etape 1: ouverture de la transaction
			tx.begin();
			
			// Etape 2: traitement avec db
			em.persist(courant);
			
			// Etape 3: fermeture de la transaction et de l'unit� de travail
			tx.commit();
			
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		} finally {
			try {
				// Etape 3: fermeture de l'unit� de travail
				em.close();
				emf.close();
				
			} catch (Exception e) {
				status = false;
				e.printStackTrace();
			}
		}
		return status;
	}

	/**
	 * M�thode permettant la cr�ation en base d'un nouveau compte Epargne
	 * 
	 * @param epargne
	 *            L'objet Epargne qui va �tre cr�e dans la base de donn�e (objet Epargne)
	 * @return Retourne true si la m�thode se d�roule bien sinon retourne false (bool�en)
	 */
	public boolean createEpargne(Epargne epargne) {
		// Ouverture de l'unit� de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean status = true;

		try {
			// Etape 1: ouverture de la transaction
			tx.begin();
			
			// Etape 2: traitement avec db
			em.persist(epargne);
			
			// Etape 3: fermeture de la transaction et de l'unit� de travail
			tx.commit();
			
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		} finally {
			try {
				// Etape 3: fermeture de l'unit� de travail
				em.close();
				emf.close();
				
			} catch (Exception e) {
				status = false;
				e.printStackTrace();
			}
		}
		return status;
	}

	/**
	 * M�thode permettant d'�ffacer en base d'un compte Courant
	 * 
	 * @param courant
	 *            L'objet Courant qui va �tre effacer dans la base de donn�e (objet Courant)
	 * @return Retourne true si la m�thode se d�roule bien sinon retourne false (bool�en)
	 */
	public boolean deleteCourant(Courant courant) {
		// Ouverture de l'unit� de travail
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
				EntityManager em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();
				boolean status = true;

				try {
					// Etape 1: ouverture de la transaction
					tx.begin();
					
					// Etape 2: traitement avec db
					em.remove(courant);
					
					// Etape 3: fermeture de la transaction et de l'unit� de travail
					tx.commit();
					
				} catch (Exception e) {
					status = false;
					e.printStackTrace();
				} finally {
					try {
						// Etape 3: fermeture de l'unit� de travail
						em.close();
						emf.close();
						
					} catch (Exception e) {
						status = false;
						e.printStackTrace();
					}
				}
				return status;
			}

	/**
	 * M�thode permettant d'�ffacer en base d'un compte Epargne
	 * 
	 * @param courant
	 *            L'objet Epargne qui va �tre effacer dans la base de donn�e (objet Epargne)
	 * @return Retourne true si la m�thode se d�roule bien sinon retourne false (bool�en)
	 */
	public boolean deleteEpargne(Epargne epargne){
		// Ouverture de l'unit� de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean status = true;

		try {
			// Etape 1: ouverture de la transaction
			tx.begin();
			
			// Etape 2: traitement avec db
			em.remove(epargne);
			
			// Etape 3: fermeture de la transaction et de l'unit� de travail
			tx.commit();
			
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		} finally {
			try {
				// Etape 3: fermeture de l'unit� de travail
				em.close();
				emf.close();
				
			} catch (Exception e) {
				status = false;
				e.printStackTrace();
			}
		}
		return status;
	}
	
	/**
	 * M�thode permettant de mettre a jour en base un compte
	 * 
	 * @param compte
	 *            L'objet Compte qui va �tre effacer dans la base de donn�e (objet Compte)
	 * @return Retourne true si la m�thode se d�roule bien sinon retourne false (bool�en)
	 */
	public boolean updateCompte(Compte compte) {
		// Ouverture de l'unit� de travail
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
				EntityManager em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();
				boolean status = true;

				try {
					// Etape 1: ouverture de la transaction
					tx.begin();
					
					// Etape 2: traitement avec db
					em.persist(compte);
					
					// Etape 3: fermeture de la transaction et de l'unit� de travail
					tx.commit();
					
				} catch (Exception e) {
					status = false;
					e.printStackTrace();
				} finally {
					try {
						// Etape 3: fermeture de l'unit� de travail
						em.close();
						emf.close();
						
					} catch (Exception e) {
						status = false;
						e.printStackTrace();
					}
				}
				return status;
			}

	/**
	 * M�thode permettant de r�cup�rer les informations en base d'un compte via son id
	 * 
	 * @param id l'identifiant du compte
	 *            L'identifiant du Compte qui va �tre recherch� dans la base de donn�e
	 * @return Retourne true si la m�thode se d�roule bien sinon retourne false (bool�en)
	 */
	public Compte findById(int id) {
		// Ouverture de l'unit� de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

			// Etape 1: ouverture de la transaction
			tx.begin();
			
			// Etape 2: traitement avec db
			Compte compte = em.find(Compte.class, id);
			
			// Etape 3: fermeture de la transaction et de l'unit� de travail
			tx.commit();

			// Etape 3: fermeture de l'unit� de travail
			em.close();
			emf.close();
			
			return compte;
	}

	/**
	 * M�thode permettant d'obtenir la liste de tout les Comptes en base
	 * 
	 * @return Retourne une liste de compte
	 */
	public List<Compte> getAllCompte(){
		List<Compte> listCompte;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu"); 
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		Query query = em.createQuery("SELECT * FROM COMPTE");
		listCompte = query.getResultList();
		tx.commit();
		em.close();
		
		return listCompte;
	}
}

