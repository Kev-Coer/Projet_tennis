package be.laurent.java;

public class Personne {
	
	private int id;
	private String nom;
	private String prenom;
	private Integer age;
	private String sexe;
	private String pays;
	
	public Personne(int id,String nom, String prenom,Integer age,String sexe,String pays) {
		this.id =id;
		this.nom = nom;
		this.prenom = prenom;
		this.age=age;
		this.sexe=sexe;
		this.pays=pays;
	}
	public Personne(String nom, String prenom,Integer age,String sexe,String pays) {
		this.nom = nom;
		this.prenom = prenom;
		this.age=age;
		this.sexe=sexe;
		this.pays=pays;
	}
	
	public Personne(){}

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
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
}