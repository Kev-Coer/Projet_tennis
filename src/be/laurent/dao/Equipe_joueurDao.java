package be.laurent.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import be.laurent.java.Equipe;
import be.laurent.java.Equipe_joueur;
import be.laurent.java.Joueur;

public class Equipe_joueurDao extends DAO<Equipe_joueur> {
	
	public Equipe_joueurDao(Connection conn){
		super(conn);
	}
	
	public boolean create(Equipe_joueur obj){
		return false;
	}
	
	public boolean delete(Equipe_joueur obj){
		return false;
	}
	
	public boolean update(Equipe_joueur obj){
		return false;
	}

	public Equipe_joueur find(int id){
		Equipe_joueur joueur = new Equipe_joueur();
		try{
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Equipe_joueur  a inner join Equipe b  on a.id_equipe_joueur=b.id_equipe inner join Joueur c on c.num_joueur_PK=a.joueur Where id_equipe_joueur = " +id);
			if(result.first())
				joueur = new Equipe_joueur(new Equipe (result.getInt("id_equipe"), result.getString("genre")),new Joueur(result.getInt("num_joueur_PK"),result.getInt("classement")));

		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return joueur;
	}


	public Equipe_joueur findstring(String obj) {
		return null;
	}

}
