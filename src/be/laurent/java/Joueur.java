package be.laurent.java;

public class Joueur  extends Personne {
	private int id;
	private int  classement;

	public Joueur(int id,int classement ) {
		super();
		this.id =id;
		this.classement = classement;
	}
	
	public Joueur(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassement() {
		return classement;
	}

	public void setClassement(int classement) {
		this.classement = classement;
	}
}
