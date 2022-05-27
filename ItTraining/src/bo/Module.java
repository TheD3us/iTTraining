package bo;

public class Module {
	
	private int id;
	private String nom;
	private Formateur formateur;
	private int note;
	private Module listeModule;
	
	
// constructeur
	
	public Module () {
		
		
			}
	public Module (int id, String nom, Formateur formateur, int note, Module listeModule) {
		
		
		this.nom = nom;
		this.formateur = formateur;
		this.note = note;
		this.listeModule = listeModule;
		
		
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
	public Module getListeModule() {
		return listeModule;
	}
	public void setListeModule(Module listeModule) {
		this.listeModule = listeModule;
	}
	
	

}