package com.ck.proxibanquev3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ck.proxibanquev3.domaine.Conseiller;


/**
 * Classe ConseillerDAO, permet la gestion des Conseiller en base
 * 
 * @author Clement et Karim
 *
 */
public class ConseillerDAO {
	
	/**
	 * M�thode permettant la cr�ation en base d'un nouveau Conseiller
	 * 
	 * @param Conseiller
	 *            L'objet Conseiller qui va �tre cr�e dans la base de donn�e (objet Conseiller)
	 * @return Retourne true si la m�thode se d�roule bien sinon retourne false (bool�en)
	 */
	public boolean createConseiller(Conseiller conseiller) {
		// Ouverture de l'unit� de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean status = true;

		try {
			// Etape 1: ouverture de la transaction
			tx.begin();
			
			// Etape 2: traitement avec db
			em.persist(conseiller);
			
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
	 * M�thode permettant d'�ffacer en base un Conseiller
	 * 
	 * @param Conseiller
	 *            L'objet Conseiller qui va �tre effacer dans la base de donn�e (objet Conseiller)
	 * @return Retourne true si la m�thode se d�roule bien sinon retourne false (bool�en)
	 */
	public boolean deleteConseiller(Conseiller conseiller) {
		// Ouverture de l'unit� de travail
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
				EntityManager em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();
				boolean status = true;
				try {
					// Etape 1: ouverture de la transaction
					tx.begin();
					
					// Etape 2: traitement avec db
					em.remove(conseiller);
					
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
	 * M�thode permettant de mettre a jour en base un Conseiller
	 * 
	 * @param Conseiller
	 *            L'objet Client qui va �tre mis a jour dans la base de donn�e (objet Conseiller)
	 * @return Retourne true si la m�thode se d�roule bien sinon retourne false (bool�en)
	 */
	public boolean updateConseiller(Conseiller conseiller) {
		// Ouverture de l'unit� de travail
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");
				EntityManager em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();
				boolean status = true;

				try {
					int id = conseiller.getId();
					Conseiller conseiller2 = em.find(Conseiller.class, id);
					// Etape 1: ouverture de la transaction
					tx.begin();

					// Etape 2: traitement avec db
					conseiller2.setNom(conseiller.getNom());
					conseiller2.setPrenom(conseiller.getPrenom());
					conseiller2.setLogin(conseiller.getLogin());
					conseiller2.setPassword(conseiller.getPassword());
					
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
	 * M�thode permettant d'obtenir un Conseiller en base � partir de son id
	 * 
	 * @param Id
	 *            L'id du Conseiller qui va �tre recherch� dans la base de donn�e
	 * @return Retourne un objet Conseiller qui correspond � la recherche effectu�
	 */
	public Conseiller findConseillerById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Conseiller conseiller = em.find(Conseiller.class, id);
		tx.commit();
		em.close();
		emf.close();
		return conseiller;
	}
	
	/**
	 * M�thode permettant d'obtenir un Conseiller en base � partir de son id
	 * 
	 * @param Login
	 *            Le login du Conseiller qui va �tre recherch� dans la base de donn�e
	 * @return Retourne un objet Conseiller qui correspond � la recherche effectu�
	 */
	public Conseiller findConseillerByLogin(String login) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Conseiller conseiller;
		Query query = em.createNamedQuery("Conseiller.findByLogin").setParameter(1, login);
		conseiller = (Conseiller) query.getResultList();
		tx.commit();
		em.close();
		emf.close();
		return conseiller;
	}
	
	/**
	 * M�thode permettant de r�cup�rer le mot de passe du Conseiller en base de donn�e � partir du login
	 * @param login du conseiller
	 * @return retourne un String "expectedpass" qui est le mot de passe du conseiller enregistr� en base de donn�e
	 */
	public String getExpectedPass(String login){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Conseiller conseiller;
		Query query = em.createNamedQuery("Conseiller.findByLogin").setParameter(1, login);
		conseiller=(Conseiller) query.getResultList();
		String expectedpass = conseiller.getPassword();
		tx.commit();
		em.close();
		emf.close();
		return expectedpass;
	}
}
