package com.ck.proxibanquev3.dao;

import java.util.List;

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
	 * Methode permettant la creation en base d'un nouveau Conseiller
	 * 
	 * @param Conseiller
	 *            L'objet Conseiller qui va etre cree dans la base de donnee (objet Conseiller)
	 * @return Retourne true si la m�thode se d�roule bien sinon retourne false (bool�en)
	 */
	public boolean createConseiller(Conseiller conseiller) {
		// Ouverture de l'unite de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");   
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean status = true;

		try {
			// Etape 1: ouverture de la transaction
			tx.begin();
			
			// Etape 2: traitement avec db
			em.persist(conseiller);
			
			// Etape 3: fermeture de la transaction et de l'unite de travail
			tx.commit();
			
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		} finally {
			try {
				// Etape 3: fermeture de l'unite de travail
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
	 * Methode permettant d'effacer en base un conseiller
	 * 
	 * @param Conseiller
	 *            L'objet Conseiller qui va etre effacer dans la base de donnee (objet Conseiller)
	 * @return Retourne true si la methode se d�roule bien sinon retourne false (booleen)
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
	 * Methode permettant de mettre a jour en base un conseiller
	 * 
	 * @param Conseiller
	 *            L'objet Client qui va etre mis a jour dans la base de donn�e (objet Conseiller)
	 * @return Retourne true si la methode se d�roule bien sinon retourne false (booleen)
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
	 *Methode permettant d'obtenir un Conseiller en base a partir de son id
	 * 
	 * @param Id
	 *            L'id du Conseiller qui va etre recherche dans la base de donnee
	 * @return Retourne un objet Conseiller qui correspond à la recherche effectue
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
	 * Methode permettant d'obtenir un Conseiller en base � partir de son id
	 * 
	 * @param Login
	 *            Le login du Conseiller qui va etre recherche dans la base de donnee
	 * @return Retourne un objet Conseiller qui correspond a la recherche effectue
	 */
	public Conseiller findConseillerByLogin(String login) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		List<Conseiller> listConseiller;
		Query query = em.createNamedQuery("Conseiller.findByLogin").setParameter(1, login);
		listConseiller = query.getResultList();
		Conseiller conseiller = listConseiller.get(0);
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
		String expectedpass = "false";
		tx.begin();
		List<Conseiller> conseiller;
		Query query = em.createNamedQuery("Conseiller.findByLogin").setParameter(1, login);
		conseiller= query.getResultList();
		if(conseiller.size() !=0){
			String expectedpass1 = conseiller.get(0).getPassword();
			tx.commit();
			em.close();
			emf.close();
			return expectedpass1;
		}else
		return expectedpass;
		
	}
}
