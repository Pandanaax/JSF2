package fr.doranco.tpjsf.beans;


import java.io.Serializable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


import fr.doranco.tpjsf.entity.User;

@ManagedBean(name = "userbean")

@SessionScoped
public class UserBean implements Serializable {
	private static final long serialVersionUID = -9205084588156158890L;

	@ManagedProperty(name = "nom", value = "DUPOND")
	private String nom;

	@ManagedProperty(name = "prenom", value = "Michel")
	private String prenom;

	@ManagedProperty(name = "dateNaissance", value = "02/10/1992")
	private String dateNaissance;

	@ManagedProperty(name = "genre", value = "homme")
	private String genre;

	@ManagedProperty(name = "email", value = "dupont.michel.doranco.fr")
	private String email;

	private String niveauDeService;


	private static final List<User> listUsers = new ArrayList<User>(Arrays.asList(
			
			new User("Benoit", "Leclerc", "27-10-1970", "homme", "benoit@doranco.fr","medium"),
			new User("Paul", "Andrieux", "12-06-1965", "homme", "paul.augustin@doranco.fr","medium"),
			new User("Laura", "Treich", "07-10-1987", "femme", "laura@doranco.fr","medium"),
			new User("Nathalie", "Tango", "17-07-1980","femme", "nathalie@doranco.fr", "prenium"))
			);
	

	
	public void deleteAction(User user) {
		listUsers.remove(user);
	}
	
	public void addAction() {
		User user = new User(this.prenom, this.nom, this.dateNaissance, this.genre, this.email, this.niveauDeService);
		listUsers.add(user);
	}
	
//	public static final Date stringToDate(String dateStr) throws ParseException {
//		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//		Date date = null;
//		try {
//			date = formatter.parse(dateStr);
//		} catch (java.text.ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return date;
//	}
	
	public UserBean() {

	}

	

	public void changeName() {
		this.nom = this.nom.toUpperCase();
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

	public void setNiveauDeService(String niveauDeService) {
		this.niveauDeService = niveauDeService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static List<User> getListusers() {
		return listUsers;
	}

	
	
}
