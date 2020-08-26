package be.laurent.dao;

import java.sql.Connection;

import be.laurent.java.Joueur;

public class JoueurDao extends DAO<Joueur> {
	
	public JoueurDao(Connection conn){
		super(conn);
	}
	
	public boolean create(Joueur obj){
		return false;
	}
	
	public boolean delete(Joueur obj){
		return false;
	}
	
	public boolean update(Joueur obj){
		return false;
	}

	public Joueur find(int obj) {
		return null;
	}

	public Joueur findstring(String obj) {
		return null;
	}
}
