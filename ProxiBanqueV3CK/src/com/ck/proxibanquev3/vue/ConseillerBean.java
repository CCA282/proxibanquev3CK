package com.ck.proxibanquev3.vue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import com.ck.proxibanquev3.domaine.Conseiller;
import com.ck.proxibanquev3.service.ClientService;
import com.ck.proxibanquev3.service.ConseillerService;



public class ConseillerBean implements Serializable {

	
	ConseillerService conseillerService= new ConseillerService();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	
	

	private List<Conseiller> conseillers = new ArrayList<Conseiller>() {
		/**
		* 
		*/
		private static final long serialVersionUID = 1L;

		{
			add(new Conseiller("Douglas", "Mbiandou", "douglas", "mbiandou"));
			add(new Conseiller("toto", "tata", "toto", "tata"));
		}
	};

	/**
	 * 
	 */
	public ConseillerBean() {
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the conseillers
	 */
	public List<Conseiller> getConseillers() {
		return conseillers;
	}

	/**
	 * @param conseillers the conseillers to set
	 */
	public void setConseillers(List<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}


    public String connecter()
    {
    	if(conseillerService.estValide(this.getLogin(),this.getPassword())==true)
    	{
    		return "/00listeclients.xhtml?i=0";
    	}else
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("username", new FacesMessage("Invalid UserName and Password"));
            return "/login.xhtml";
        }
//        if("test".equalsIgnoreCase(getLogin()) && "test".equals(getPassword()))
//        {
//            return "/00listeclients.xhtml?i=0";
//        }
//        else
//        {
//            FacesContext context = FacesContext.getCurrentInstance();
//            context.addMessage("username", new FacesMessage("Invalid UserName and Password"));
//            return "/login.xhtml";
//        }
    }



}
