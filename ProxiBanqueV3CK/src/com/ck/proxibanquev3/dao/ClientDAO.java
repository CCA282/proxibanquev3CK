package com.ck.proxibanquev3.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.ck.proxibanquev3.domaine.Client;

/**
 * Classe ClientDao, permet la gestion des Clients en base
 * 
 * @author Clement et Karim
 *
 */
public class ClientDAO {

	/**
	 * Methode permettant la création en base d'un nouveau client
	 * 
	 * @param client
	 *            L'objet client qui va etre cree dans la base de donnee (objet
	 *            Client)
	 * @return Retourne true si la methode se deroule bien sinon retourne false
	 *         (booleen)
	 */
	public boolean createClient(Client client) {
		// Ouverture de l'unite de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean status = true;

		try {
			// Etape 1: ouverture de la transaction
			tx.begin();

			// Etape 2: traitement avec db
			em.persist(client);

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
	 * Methode permettant d'éffacer un Client en base
	 * 
	 * @param client
	 *            L'objet Client qui va etre effacer dans la base de donnee
	 *            (objet Client)
	 * @return Retourne true si la methode se deroule bien sinon retourne false
	 *         (booleen)
	 */
	public boolean deleteClient(Client client) {
		// Ouverture de l'unite de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean status = true;

		try {
			// Etape 1: ouverture de la transaction
			tx.begin();

			// Etape 2: traitement avec db
			int id = client.getId();
			Client client2 = em.find(Client.class, id);
			em.remove(client2);

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
	 * Methode permettant de mettre a jour un Client en base
	 * 
	 * @param client
	 *            L'objet Client qui va etre mis a jour dans la base de donnee
	 *            (objet Client)
	 * @return Retourne true si la m�thode se deroule bien sinon retourne false
	 *         (booleen)
	 */
	public boolean updateClient(Client client) {
		// Ouverture de l'unit� de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean status = true;

		try {
			int id = client.getId();
			Client client2 = em.find(Client.class, id);
			// Etape 1: ouverture de la transaction
			tx.begin();

			// Etape 2: traitement avec db
			client2.setNom(client.getNom());
			client2.setPrenom(client.getPrenom());
			client2.setAdresse(client.getAdresse());
			client2.setEmail(client.getEmail());

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
	 * M�thode permettant d'obtenir un Client en base a partir de son id
	 * 
	 * @param id
	 *            L'id du Client qui va etre recherche dans la base de donnee
	 * @return Retourne un objet client qui correspond a la recherche effectue
	 */
	public Client findClientById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Client client = em.find(Client.class, id);
		tx.commit();
		em.close();
		emf.close();
		return client;
	}

	/**
	 * Methode permettant d'obtenir la liste de tout les Clients en base
	 * 
	 * @return Retourne une list de clients
	 */
	@SuppressWarnings("unchecked")
	public List<Client> getAllClient() {
		List<Client> listClient;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query query = em.createQuery("from Client");
		listClient = query.getResultList();
		tx.commit();
		em.close();

		return listClient;
	}

	/**
	 * Methode permettant d'obtenir la liste de tout les Clients d'un conseiler
	 * en base
	 * 
	 * @param id
	 *            l'identifiant du conseiller
	 * @return Retourne une liste de clients pris en charge par un conseiller
	 */
	@SuppressWarnings("unchecked")
	public List<Client> getAllCLientByConseiller(int id) {
		List<Client> listClientByConseiller;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3CK-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query query = em.createQuery("from Client where idConseiller='" + id + "';");
		listClientByConseiller = query.getResultList();
		tx.commit();
		em.close();
		return listClientByConseiller;
	}
}
