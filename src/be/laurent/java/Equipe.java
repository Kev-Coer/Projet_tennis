package be.laurent.java;

public class Equipe {
	private int idE;
	private String genre;
	
	public int getIdE() {
		return idE;
	}

	public void setIdE(int idE) {
		this.idE = idE;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Equipe() {
		
	}
	
	public Equipe(int idE,String genre) {
		this.idE=idE;
		this.genre=genre;
	}
	public Equipe_joueur Info(int a)
	{
		Equipe_joueur equipe= new Equipe_joueur();
		return equipe.Info(a);
	}
	
}

