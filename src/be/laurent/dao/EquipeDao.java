package be.laurent.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import be.laurent.java.Equipe;

public class EquipeDao extends DAO<Equipe> {
	
	public EquipeDao(Connection conn){
		super(conn);
	}
	
	public boolean create(Equipe obj){
		return false;
	}
	
	public boolean delete(Equipe obj){
		return false;
	}
	
	public boolean update(Equipe obj){
		return false;
	}

	
	public Equipe findstring(String info){
		Equipe joueur = new Equipe();
		try{
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Equipe WHERE genre = " +info);
			if(result.first())
				joueur = new Equipe(result.getInt("id_equipe"),result.getString("genre"));

		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return joueur;
	}

	public Equipe find(int id) {
		Equipe joueur = new Equipe();
		try{
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Equipe WHERE id_equipe = " +id);
			if(result.first())
				joueur = new Equipe(result.getInt("id_equipe"),result.getString("genre"));

		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return joueur;
	}
	

}
