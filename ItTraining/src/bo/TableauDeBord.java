package bo;

import java.util.List;

public class TableauDeBord {
	private List<Formation> formations;
	private List<Evaluation> evaluations;
	private int noteAccueil;
	private int noteEnvironement;
	private int noteModule;
	private int noteFormation;
	private int noteContenuModule;
	private int noteFormateur;
	private int notePedagogieFormateur;
	private int noteMaitriseSujetFormateur;
	private int noteDisponibilitéFormateur;
	private int noteReponseFormateur;
	private int noteAnimationFormateur;
	private int noteSatisfaction;
	private boolean resultatRecommandation;
	private int resultatProjetFormation;
	
	// Constructeurs
	
	public TableauDeBord() {
		super();
	}
	
	
	
	public TableauDeBord(List<Formation> formations, List<Evaluation> evaluations, int noteAccueil,
			int noteEnvironement, int noteModule, int noteFormation, int noteContenuModule, int noteFormateur, int notePedagogieFormateur, int noteMaitriseSujetFormateur,
			int noteDisponibilitéFormateur, int noteReponseFormateur, int noteAnimationFormateur, int noteSatisfaction,
			boolean resultatRecommandation, int resultatProjetFormation) {
		super();
		this.formations = formations;
		this.evaluations = evaluations;
		this.noteAccueil = noteAccueil;
		this.noteEnvironement = noteEnvironement;
		this.noteModule = noteModule;
		this.noteFormation = noteFormation;
		this.noteContenuModule = noteContenuModule;
		this.noteFormateur = noteFormateur;
		this.notePedagogieFormateur = notePedagogieFormateur;
		this.noteMaitriseSujetFormateur = noteMaitriseSujetFormateur;
		this.noteDisponibilitéFormateur = noteDisponibilitéFormateur;
		this.noteReponseFormateur = noteReponseFormateur;
		this.noteAnimationFormateur = noteAnimationFormateur;
		this.noteSatisfaction = noteSatisfaction;
		this.resultatRecommandation = resultatRecommandation;
		this.resultatProjetFormation = resultatProjetFormation;
	}



	//Get & Set
	
	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public int getNoteAccueil() {
		return noteAccueil;
	}

	public void setNoteAccueil(int noteAccueil) {
		this.noteAccueil = noteAccueil;
	}

	public int getNoteEnvironement() {
		return noteEnvironement;
	}

	public void setNoteEnvironement(int noteEnvironement) {
		this.noteEnvironement = noteEnvironement;
	}

	public int getNoteModule() {
		return noteModule;
	}

	public void setNoteModule(int noteModule) {
		this.noteModule = noteModule;
	}

	public int getNoteFormation() {
		return noteFormation;
	}

	public void setNoteFormation(int noteFormation) {
		this.noteFormation = noteFormation;
	}

	public int getNoteContenuModule() {
		return noteContenuModule;
	}

	public void setNoteContenuModule(int noteContenuModule) {
		this.noteContenuModule = noteContenuModule;
	}

	public int getNoteFormateur() {
		return noteFormateur;
	}

	public void setNoteFormateur(int noteFormateur) {
		this.noteFormateur = noteFormateur;
	}

	public int getNotePedagogieFormateur() {
		return notePedagogieFormateur;
	}

	public void setNotePedagogieFormateur(int notePedagogieFormateur) {
		this.notePedagogieFormateur = notePedagogieFormateur;
	}

	public int getNoteMaitriseSujetFormateur() {
		return noteMaitriseSujetFormateur;
	}

	public void setNoteMaitriseSujetFormateur(int noteMaitriseSujetFormateur) {
		this.noteMaitriseSujetFormateur = noteMaitriseSujetFormateur;
	}

	public int getNoteDisponibilitéFormateur() {
		return noteDisponibilitéFormateur;
	}

	public void setNoteDisponibilitéFormateur(int noteDisponibilitéFormateur) {
		this.noteDisponibilitéFormateur = noteDisponibilitéFormateur;
	}

	public int getNoteReponseFormateur() {
		return noteReponseFormateur;
	}

	public void setNoteReponseFormateur(int noteReponseFormateur) {
		this.noteReponseFormateur = noteReponseFormateur;
	}

	public int getNoteAnimationFormateur() {
		return noteAnimationFormateur;
	}

	public void setNoteAnimationFormateur(int noteAnimationFormateur) {
		this.noteAnimationFormateur = noteAnimationFormateur;
	}

	public int getNoteSatisfaction() {
		return noteSatisfaction;
	}

	public void setNoteSatisfaction(int noteSatisfaction) {
		this.noteSatisfaction = noteSatisfaction;
	}

	public boolean isResultatRecommandation() {
		return resultatRecommandation;
	}

	public void setResultatRecommandation(boolean resultatRecommandation) {
		this.resultatRecommandation = resultatRecommandation;
	}

	public int getResultatProjetFormation() {
		return resultatProjetFormation;
	}

	public void setResultatProjetFormation(int resultatProjetFormation) {
		this.resultatProjetFormation = resultatProjetFormation;
	}
	
	
	
}
