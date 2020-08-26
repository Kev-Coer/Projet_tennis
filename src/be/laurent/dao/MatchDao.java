package be.laurent.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be.laurent.java.Arbitre;
import be.laurent.java.Match;


public class MatchDao extends DAO<Match> {
	
	public MatchDao(Connection conn){
		super(conn);
	}
	
	public boolean create(Match obj){
		
		try{
			
			String insertion = "INSERT INTO Match(Groupe1,Groupe2,Set1,Set2,Set3,Set4,Set5,Datej,Id_Arbitre_FK,Id_Terrain,Duree ) values ('" + obj.getEquipe11().getIdE()+ "','"+obj.getEquipe22().getIdE()+"','"+obj.getset1()+"','"
					+obj.getset2()+"','"+obj.getset3()+"','"+obj.getset4()+"','"+obj.getset5()+"','"+obj.GetDate()+"','"+obj.getArbitree().getId()+"','"+obj.getCourt()+"','"+obj.getDuree()+"');";
			System.out.println(insertion);
			int result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeUpdate(insertion);	
			if(result==1) //Cree
			{
				return true;
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return true;
		
	}
	
	public boolean delete(Match obj){
		return false;
	}
	
	public boolean update(Match obj){
		return false;
	}

	public Match find(int obj) {
		
		return null;
	}

	public Match findstring(String obj) {
		return null;
	}
	
	
	public List<Match> list(){
		List<Match> list = new ArrayList<Match>();
		try
		{
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Match a inner join Arbitre b on a.Id_Arbitre_FK=b.num_arbitre_PK ");
			
			while(result.next()) //verif pri
			{
				list.add(new Match(result.getInt("Groupe1"), result.getInt("Groupe1"), result.getString("Set1"), result.getString("Set2"), result.getString("Set3"), result.getString("Set4"),
						 result.getString("Set5"),result.getString("DateJ"), result.getInt("Id_Terrain"),result.getString("Duree"),(new Arbitre(result.getInt("num_arbitre_PK"),result.getInt("carrière")))));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return list;
	}

}