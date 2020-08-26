package be.laurent.java;

public class Tournois {
	
	private String nom;
	private String tableautype[] = {"MS", "DS", "DM" , "DD" , "Mix" };
	
	public Tournois() {
		
	}
	public Tournois(String nom) {
		this.nom=nom;
	}
	
	public Tournois(String nom,String tableautype []) {
		this.nom=nom;
		this.tableautype=tableautype;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String[] getTableauChaine() {
		return tableautype;
	}
	public void setTableauChaine(String[] tableautype) {
		this.tableautype = tableautype;
	}

}