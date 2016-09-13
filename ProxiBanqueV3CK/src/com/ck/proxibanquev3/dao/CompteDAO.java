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
	 * Méthode permettant la création en base d'un nouveau compte Courant
	 * 
	 * @param courant
	 *            L'objet Courant qui va être crée dans la base de donnée (objet Courant)
	 * @return Retourne true si la méthode se déroule bien sinon retourne false (booléen)
	 */
	public boolean createCourant(Courant courant) {
		// Ouverture de l'unité de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean status = true;

		try {
			// Etape 1: ouverture de la transaction
			tx.begin();
			
			// Etape 2: traitement avec db
			em.persist(courant);
			
			// Etape 3: fermeture de la transaction et de l'unité de travail
			tx.commit();
			
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		} finally {
			try {
				// Etape 3: fermeture de l'unité de travail
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
	 * Méthode permettant la création en base d'un nouveau compte Epargne
	 * 
	 * @param epargne
	 *            L'objet Epargne qui va être crée dans la base de donnée (objet Epargne)
	 * @return Retourne true si la méthode se déroule bien sinon retourne false (booléen)
	 */
	public boolean createEpargne(Epargne epargne) {
		// Ouverture de l'unité de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean status = true;

		try {
			// Etape 1: ouverture de la transaction
			tx.begin();
			
			// Etape 2: traitement avec db
			em.persist(epargne);
			
			// Etape 3: fermeture de la transaction et de l'unité de travail
			tx.commit();
			
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		} finally {
			try {
				// Etape 3: fermeture de l'unité de travail
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
	 * Méthode permettant d'éffacer en base d'un compte Courant
	 * 
	 * @param courant
	 *            L'objet Courant qui va être effacer dans la base de donnée (objet Courant)
	 * @return Retourne true si la méthode se déroule bien sinon retourne false (booléen)
	 */
	public boolean deleteCourant(Courant courant) {
		// Ouverture de l'unité de travail
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
				EntityManager em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();
				boolean status = true;

				try {
					// Etape 1: ouverture de la transaction
					tx.begin();
					
					// Etape 2: traitement avec db
					em.remove(courant);
					
					// Etape 3: fermeture de la transaction et de l'unité de travail
					tx.commit();
					
				} catch (Exception e) {
					status = false;
					e.printStackTrace();
				} finally {
					try {
						// Etape 3: fermeture de l'unité de travail
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
	 * Méthode permettant d'éffacer en base d'un compte Epargne
	 * 
	 * @param courant
	 *            L'objet Epargne qui va être effacer dans la base de donnée (objet Epargne)
	 * @return Retourne true si la méthode se déroule bien sinon retourne false (booléen)
	 */
	public boolean deleteEpargne(Epargne epargne){
		// Ouverture de l'unité de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean status = true;

		try {
			// Etape 1: ouverture de la transaction
			tx.begin();
			
			// Etape 2: traitement avec db
			em.remove(epargne);
			
			// Etape 3: fermeture de la transaction et de l'unité de travail
			tx.commit();
			
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		} finally {
			try {
				// Etape 3: fermeture de l'unité de travail
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
	 * Méthode permettant de mettre a jour en base un compte
	 * 
	 * @param compte
	 *            L'objet Compte qui va être effacer dans la base de donnée (objet Compte)
	 * @return Retourne true si la méthode se déroule bien sinon retourne false (booléen)
	 */
	public boolean updateCompte(Compte compte) {
		// Ouverture de l'unit� de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean status = true;

		try {
			int id = compte.getIdCompte();
			Compte compte2 = em.find(Compte.class, id);
			// Etape 1: ouverture de la transaction
			tx.begin();

			// Etape 2: traitement avec db
			compte2.setSolde(compte.getSolde());
			
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
	 * Méthode permettant de récupérer les informations en base d'un compte via son id
	 * 
	 * @param id l'identifiant du compte
	 *            L'identifiant du Compte qui va être recherché dans la base de donnée
	 * @return Retourne true si la méthode se déroule bien sinon retourne false (booléen)
	 */
	public Compte findById(int id) {
		// Ouverture de l'unité de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

			// Etape 1: ouverture de la transaction
			tx.begin();
			
			// Etape 2: traitement avec db
			Compte compte = em.find(Compte.class, id);
			
			// Etape 3: fermeture de la transaction et de l'unité de travail
			tx.commit();

			// Etape 3: fermeture de l'unité de travail
			em.close();
			emf.close();
			
			return compte;
	}

	/**
	 * Méthode permettant d'obtenir la liste de tout les Comptes en base
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

