package be.laurent.java;

import be.laurent.dao.Equipe_joueurDao;
import be.laurent.dao.JVConnection;

public class Equipe_joueur {
	private Equipe id_equipe_joueur;
	private Joueur joueur;
	
	public Equipe_joueur(Equipe id_equipe_joueur,Joueur joueur) {
		this.id_equipe_joueur=id_equipe_joueur;
		this.joueur=joueur;
	}
	
	public Equipe_joueur(Equipe id_equipe_joueur) {
		this.id_equipe_joueur=id_equipe_joueur;
		
	}
	
	public Equipe_joueur() {
		
	}
	
	public Joueur getJoueur() {
		return joueur;
	}
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	
	public Equipe getEquipe() {
		return this.id_equipe_joueur;
	}
	
	public void setEquipe(Equipe equipe) {
		this.id_equipe_joueur = equipe;
	}
	
	public Equipe_joueur Info (int a)
	{
		Equipe_joueurDao equipe_joueurDAO = new Equipe_joueurDao(JVConnection.getInstance());
		return equipe_joueurDAO.find(a);
	}

}