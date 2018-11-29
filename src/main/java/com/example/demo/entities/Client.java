package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
@Document 
public class Client  implements Serializable{
	
	private Long code;
	private String nom;
	private String prenom;
	private Date date_nais;
	
	
	
	
	
	public Client(String nom, String prenom, Date date_nais) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date_nais = date_nais;
	}
	public Client(Long code, String nom, String prenom, Date date_nais) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.date_nais = date_nais;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
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
	public Date getDate_nais() {
		return date_nais;
	}
	public void setDate_nais(Date date_nais) {
		this.date_nais = date_nais;
	}
	
	

}
