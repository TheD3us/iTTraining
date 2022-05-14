package bo;

public class Adresse {
	private int id;
	private int noRue;
	private String complement;
	private String typeVoie;
	private String nomVoie;
	private String cpo;
	private String ville;
	private String etage;
	private int appartement;
	
	
	public Adresse() {
		super();
	}
	
	public Adresse(int id, int noRue, String complement, String typeVoie, String nomVoie, String cpo, String ville,
			String etage, int appartement) {
		super();
		this.id = id;
		this.noRue = noRue;
		this.complement = complement;
		this.typeVoie = typeVoie;
		this.nomVoie = nomVoie;
		this.cpo = cpo;
		this.ville = ville;
		this.etage = etage;
		this.appartement = appartement;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNoRue() {
		return noRue;
	}
	public void setNoRue(int noRue) {
		this.noRue = noRue;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getTypeVoie() {
		return typeVoie;
	}
	public void setTypeVoie(String typeVoie) {
		this.typeVoie = typeVoie;
	}
	public String getNomVoie() {
		return nomVoie;
	}
	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}
	public String getCpo() {
		return cpo;
	}
	public void setCpo(String cpo) {
		this.cpo = cpo;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getEtage() {
		return etage;
	}
	public void setEtage(String etage) {
		this.etage = etage;
	}
	public int getAppartement() {
		return appartement;
	}
	public void setAppartement(int appartement) {
		this.appartement = appartement;
	}
	
	
}
