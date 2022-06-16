package fr.ib.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
public class Module {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	
	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="formateur")
	private List<Formateur> formateur;
	private int note;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name="module")
	@JsonIgnore
	private List<Module> listeModule = new ArrayList<Module>();
	

		
// constructeur
	
	public Module () {
		
		
			}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	

	public List<Formateur> getFormateur() {
		return formateur;
	}

	public void setFormateur(List<Formateur> formateur) {
		this.formateur = formateur;
	}

	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}

	public List<Module> getListeModule() {
		return listeModule;
	}

	public void setListeModule(List<Module> listeModule) {
		this.listeModule = listeModule;
	}

	
	
	

}