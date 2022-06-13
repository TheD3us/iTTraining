package fr.ib.bo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Module {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name="formateur")
	private List<Formateur> formateur;
	private int note;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name="module")
	private List<Module> listeModule;
	
	
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
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
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