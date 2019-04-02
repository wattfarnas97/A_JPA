package org.sid.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Produit implements Serializable {
	@Id @GeneratedValue
private Long id;
@Column(length=70)
private String designation;
private  double prix;
private double quantite;
@ManyToOne
@JoinColumn(name="ID_CAT")
private Categorie  categorie;
public Produit(Long id, String designation, double prix, double quantite, Categorie categorie) {
	super();
	this.id = id;
	this.designation = designation;
	this.prix = prix;
	this.quantite = quantite;
	this.categorie = categorie;
}
public Categorie getCategorie() {
	return categorie;
}
public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}
public Produit( String designation, double prix, double quantite) {
	super();
	

	this.designation = designation;
	this.prix = prix;
	this.quantite = quantite;
}
public Produit(String string, int i, int j) {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Produit [id=" + id + ", designation=" + designation + ", prix=" + prix + ", quantite=" + quantite + "]";
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public double getQuantite() {
	return quantite;
}
public void setQuantite(double quantite) {
	this.quantite = quantite;
}
 
}

