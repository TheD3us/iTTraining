package fr.ib.bo;

public class Test {
	
	private int id;
	private String cheminTest;
	private String reponseTest;
	
	// constructeur
	
	public Test () {
		
	}

	public Test (int id, String cheminTest, String reponseTest) {
		
	this.id = id;		
	this.cheminTest = cheminTest;
	this.reponseTest = reponseTest;
			
    }	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCheminTest() {
		return cheminTest;
	}
	public void setCheminTest(String cheminTest) {
		this.cheminTest = cheminTest;
	}
	public String getResponseTest() {
		return reponseTest;
	}
	public void setResponseTest(String reponseTest) {
		this.reponseTest = reponseTest;
	}
	

}