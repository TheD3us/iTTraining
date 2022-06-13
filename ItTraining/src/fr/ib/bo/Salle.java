package fr.ib.bo;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salle {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Adresse adresse;
	private String nomSalle;
	private List<Machine> machines;
		
	//Constructeurs
	
	public Salle() {
		super();
	}

	public Salle(int id, Adresse adresse, String nomSalle, List<Machine> machines) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.nomSalle = nomSalle;
		this.machines = machines;
		
	}

	//Get & Set 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	public List<Machine> getMachines() {
		return machines;
	}

	public void setMachines(List<Machine> machines) {
		this.machines = machines;
	}


}

