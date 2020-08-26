package be.laurent.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import be.laurent.java.Personne;

public class PersonneDao extends DAO<Personne> {
	
	public PersonneDao(Connection conn){
		super(conn);
	}
	
	public boolean create(Personne obj){
		return false;
	}
	
	public boolean delete(Personne obj){
		return false;
	}
	
	public boolean update(Personne obj){
		return false;
	}

	
	public Personne find(int id){
		Personne joueur = new Personne();
		try{
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
	ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Personne WHERE num_pers_PK = " +id);
			if(result.first())
				joueur = new Personne(result.getInt("num_pers_PK"),result.getString("nom"),result.getString("prenom"),result.getInt("age"),result.getString("sexe"),result.getString("pays"));

		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return joueur;
	}

	public Personne findstring(String obj) {
		return null;
	}
	
}