package be.laurent.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be.laurent.java.Arbitre;

public class ArbitreDao extends DAO<Arbitre> {
	
	public ArbitreDao(Connection conn){
		super(conn);
	}
	
	public boolean create(Arbitre obj){
		return false;
	}
	
	public boolean delete(Arbitre obj){
		return false;
	}
	
	public boolean update(Arbitre obj){
		return false;
	}

	public Arbitre find(int id) {
		Arbitre joueur = new Arbitre();
		try{
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Arbitre a inner join Personne b on a.num_arbitre_PK=b.num_pers_PK WHERE num_arbitre_PK = " +id);
			if(result.first())
				joueur = new Arbitre(result.getInt("num_arbitre_PK"),result.getInt("carrière"),result.getString("nom"),result.getString("prenom"),result.getInt("age"),result.getString("sexe"),result.getString("pays"));				
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return joueur;
	}

	public Arbitre findstring(String obj) {
		return null;
	}	
	
	public List<Arbitre> list(){
		List<Arbitre> list = new ArrayList<Arbitre>();
		try
		{
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Arbitre a inner join Personne b on a.num_arbitre_PK=b.num_pers_PK");
			
			while(result.next()) //verif pri
			{
				list.add(new Arbitre(result.getInt("num_arbitre_PK"),result.getInt("carrière"), result.getString("nom"), result.getString("prenom"), result.getInt("age"), result.getString("sexe"), result.getString("Pays")));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return list;
	}
}