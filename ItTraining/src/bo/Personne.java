package bo;

public class Personne {
	private int id;
	private String nom;
	private String prenom;
	private Adresse adresse;
	private String mail;
	private String numTelephone;
	private String motDePasse; 
	private String role;
	
	
	// Constructeurs
	
	public Personne() {
		super();
	}
	
	public Personne(int id, String nom, String prenom, Adresse adresse, String mail, String numTelephone,
			String motDePasse, String role) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.mail = mail;
		this.numTelephone = numTelephone;
		this.motDePasse = motDePasse;
		this.role = role;
	}
	
	
	// Getter et Setters

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNumTelephone() {
		return numTelephone;
	}

	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}




	
	
}
