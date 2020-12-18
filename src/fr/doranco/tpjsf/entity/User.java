package fr.doranco.tpjsf.entity;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userbean")

@SessionScoped
public class User implements Serializable {
	private static final long serialVersionUID = -9205084588156158890L;

	@ManagedProperty(name = "nom", value = "DUPOND")
	private String nom;

	@ManagedProperty(name = "prenom", value = "Michel")
	private String prenom;
	
	@ManagedProperty(name = "dateNaissance", value = "02/10/1996")
	private String dateNaissance;

	@ManagedProperty(name = "genre", value = "homme")
	private String genre;

	@ManagedProperty(name = "email", value = "dupont.michel.doranco.fr")
	private String email;
	private String niveauDeService;

	
	public User(String nom, String prenom, String dateNaissance, String genre, String email, String niveauDeService) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.genre = genre;
		this.email = email;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNiveauDeService() {
		return niveauDeService;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	
}
	
	
	


	



	