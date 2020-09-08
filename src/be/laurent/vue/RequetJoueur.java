package be.laurent.vue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.List;

import javax.swing.JOptionPane;


public class RequetJoueur {
	
	public void RequetJoueur (List list,String type)
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
			String requete = ("SELECT nom,prenom,age,classement From Personne a inner join Joueur b on a.num_pers_PK=b.num_joueur_PK where sexe = '"+type+"'");

			stmt = connec.createStatement();
			res = stmt.executeQuery(requete);
		
			String nom,prenom,age,classement;
			while(res.next()) {
				nom = res.getString(1);
				prenom = res.getString(2);
				age = res.getString(3);
				classement = res.getString(4);
				String info = nom +" "+prenom+ " "+age+ " Ans  " + classement+ " : Classement ";
				list.add(info);	
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