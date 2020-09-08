package be.laurent.vue;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class RequetMatch 
{
	public void RequetMatch(List list,int position,int position2)
	{
		try 
		{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}
		catch(ClassNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "Class de tennis introuvable " +e.getMessage());
		}
		Connection connec = null;
		Statement stmt = null;
		ResultSet res=null;
		try
		{
			connec = DriverManager.getConnection("jdbc:ucanaccess://./BDtennis.accdb");
			String requete = ("SELECT * From Match a inner join Arbitre b on a.Id_Arbitre_FK=num_arbitre_PK inner join Personne c on b.num_arbitre_PK=c.num_pers_PK "
					+ " where Id_Match_pk BETWEEN '"+position+"' and '"+position2+"'");
	
			stmt = connec.createStatement();
			res = stmt.executeQuery(requete);
		
			String equipe1n,equipe2,set,set2,set3,set4,set5,date,arbitre,terrain,duree;
			while(res.next()) {
				equipe1n = res.getString(2);
				equipe2 = res.getString(3);
				set = res.getString(4);
				set2 = res.getString(5);
				set3 = res.getString(6);
				if(set3.contentEquals("null")  )set3= " ";
				set4 = res.getString(7);
				if(set4.contentEquals("null") )set4= " ";
				set5 = res.getString(8);
				if(set5.contentEquals("null") )set5= " ";
				date = res.getString(12);
				arbitre = res.getString(16);
				terrain = res.getString(10);
				duree = res.getString(11);
				String info = equipe1n +" vs "+equipe2 + " Le : " +date;
				String info2 = "Set: "+set+ " " + set2+ " "+set3+ " " + set4+ " "+set5;
				String info3 ="Arbitre :"+ arbitre+ " Sur le terrain :"+terrain;
				list.add(info);
				list.add(info2);
				list.add(duree);
				list.add(info3);	
			}
		}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null,"Erreur JDBC :  " +e.getMessage());
		}
		finally
		{
			try
			{
				if(res !=null)
				{
					res.close();
				}
				if(res !=null)
				{
					stmt.close();
				}
				if(res !=null)
				{
					connec.close();
				}
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
