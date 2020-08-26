package be.laurent.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


import be.laurent.dao.JVConnection;
import be.laurent.dao.MatchDao;

public class Match {

	
	private int id;
	private int groupe1;
	private int groupe2;
	private String set1;
	private String set2;
	private String set3;
	private String set4;
	private String set5;
	private LocalDateTime tableaudate[] = {LocalDateTime.of(2020, 5, 8, 8, 0),LocalDateTime.of(2020, 5, 18, 8, 0),LocalDateTime.of(2020, 5, 28, 8, 0)};
	private String date;
	private int court;
	private String duree;
	private Arbitre arbitre;
	private Equipe equipe1;
	private Equipe equipe2;
	private int sum =0;
	private int total=0;
	private int drag=0;

	public Match()
	{
		
	}
	
	public Match(int groupe1,int groupe2,String set1, String set2,String set3,String set4,String set5,String date,int court,String duree,Arbitre arbitre)
	{
		this.groupe1=groupe1;
		this.groupe2=groupe2;
		this.set1=set1;
		this.set2=set2;
		this.set3=set3;
		this.set4=set4;
		this.set5=set5;
		this.date=date;	
		this.court=court;
		this.duree=duree;
		this.arbitre=arbitre;
	}
	public Match(Equipe equipe1,Equipe equipe2,String set1, String set2,String set3,String set4,String set5,String date,int court,String duree,Arbitre arbitre)
	{
		this.set1=set1;
		this.set2=set2;
		this.set3=set3;
		this.set4=set4;
		this.set5=set5;
		this.date=date;
		this.court=court;
		this.duree=duree;
		this.arbitre=arbitre;
		this.equipe1=equipe1;
		this.equipe2=equipe2;
	}
	public int getId() {
		return id;
	}
	public Arbitre getArbitree()
	{
		return arbitre;
	}
	public void setArbitree(Arbitre arbitre) {
		this.arbitre = arbitre;
	}
	public Equipe getEquipe11()
	{
		return equipe1;
	}
	public void setEquipe11(Equipe equipe1) {
		this.equipe1 = equipe1;
	}
	public Equipe getEquipe22()
	{
		return equipe2;
	}
	public void setEquipe22(Equipe equipe2) {
		this.equipe2 = equipe2;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEquipe1() {
		return groupe1;
	}
	public void setEquipe1(int groupe1) {
		this.groupe1 = groupe1;
	}
	public int getEquipe2() {
		return groupe2;
	}
	public void setEquipe2(int groupe2) {
		this.groupe2 = groupe2;
	}	
	public String getset1() {
		return set1;
	}
	public void setSet1(String set1) {
		this.set1 = set1;
	}
	public String getset2() {
		return set2;
	}
	public void setSet2(String set2) {
		this.set2 = set2;
	}
	public String getset3() {
		return set3;
	}
	public void setSet3(String set3) {
		this.set3 = set3;
	}
	public String getset4() {
		return set4;
	}
	public void setSet4(String set4) {
		this.set4 = set4;
	}
	public String getset5() {
		return set5;
	}
	public void setSet5(String set5) {
		this.set5 = set5;
	}
	public String GetDate() {
		return this.date;
	}
	public void setDate(String date)
	{
		this.date=date;
	}
	public int getCourt() {
		return court;
	}
	public void setCourt(int court) {
		this.court = court;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}


	
	
	public Equipe_joueur Info(int a)
	{
		Equipe info = new Equipe();
		return info.Info(a);
	}
	
	
	public int Duree()
	{
		Random random = new Random();
	    return random.ints(30,80).findFirst().getAsInt();

	}
	
	
	public int CalculMacht(int equipe1, int equipe2,int type)
	{
		Match match = new Match();
		Equipe_joueur eq1;
		Equipe_joueur eq2 ;
		eq1 = Info(equipe1);
		eq2 = Info(equipe2);
		match.setEquipe11(eq1.getEquipe());
		match.setEquipe22(eq2.getEquipe());
		//DateMatch(type,match);
		int duree = 0;
		int group1=0;
	    int group2=0;
	    int gagne1=0;
	    int gagne2=0;
	    int scoore ;
	    int sortie = 0;
	    int resultat1=0, resultat2=0;
	    int total=0;
	    int nombre;
	    if(type == 0)
	    {
	    	nombre =2; // 5 set
	    }
	    else
	    {
	    	nombre =1; //3 set
	    }
	    
	    //System.out.println("Joueur "+ equipe1 + "vs Joueur2 "+ equipe2);
	    while(sortie ==0)  
	    {
	    	group1=0;
	    	group2=0;
	    	scoore=0;
	    	sortie=0;
	    	resultat1=0;
	    	resultat2=0;
	    	total++;
    		//System.out.print("Set "+ total + " : ");
	    	while(sortie ==0) //macth normaux
		    {	
		    	scoore = ThreadLocalRandom.current().nextInt(4); 
		 	    if( scoore == 0 || scoore == 1 )
		 		{
		 	    	group1++;
		 		}
		 	    else
		 	    {
		 	    	group2++;
		 	    }
		 	   //System.out.print(group1 + " vs " +group2 + " ");
		 	    if(group1 == 6 && group2 <5 ||group1 == 7 && group2 ==5 )
		 	    {
		 	    	sortie = 1;
		 	    	gagne1++;
		 	    	//System.out.print(group1 + " vs " +group2 + " ");
		 	    }
		 	    else if(group2 == 6 && group1 <5 || group2 == 7 && group1 ==5)
		 	    {
		 	    	sortie = 1;
		 	    	gagne2++;
		 	    	//System.out.print(group1 + " vs " +group2 + " ");
		 	    }
		 	    if(group1 ==6 && group2 == 6)//tie brake
		 	    	{
		 	    	group1 =0;
		 	    	group2 =0;
		    		while(sortie == 0 )
		    	    {
		    			scoore = ThreadLocalRandom.current().nextInt(4); 
		    	 	    if( scoore == 0 || scoore == 2)
		    	 		{
		    	 	    	group1++;;
		    	 		}
		    	 	    else
		    	 	    {
		    	 	    	group2++;	    	 	    	 
		    	 	    }
		    	 	   //System.out.print(group1 + " vs " +group2 + " ");
		    	 	    if(group1 ==7 && group2 <6 )// condition des 2 jeux d'ecrat
		    	 	    {
		    	 	    	sortie=1;
		    	 	    	gagne1++;
		    	 	    	group1=7;
		    	 	    	group2=6;
		    	 	    	//System.out.print(group1 + " vs " +group2 + " ");
		    	 	    }
		    	 	    else if(group2 == 7 && group1 <6) {
		    	 	    	sortie=1;
		    	 	    	gagne2++;
		    	 	    	group1=6;
		    	 	    	group2=7;
		    	 	    	//System.out.print(group1 + " vs " +group2 + " ");
		    	 	    }
		    	 	    else if (group1 >5 && group2 >5)
		    	 	    {
		    	 	    	resultat1= group1-group2;
		    	 	    	resultat2= group2-group1;
		    	 	    	if(resultat1 ==2)
			    	 	    {
			    	 	    	sortie=1;
			    	 	    	gagne1++;
			    	 	    	group1=7;
			    	 	    	group2=6;
			    	 	    	//System.out.print(7 + " vs " + 6 + " ");
			    	 	    }
		    	 	    	else if(resultat2 == 2)
		    	 	    	{
		    	 	    		sortie=1;
		    	 	    		gagne2++;
		    	 	    		group1=6;
			    	 	    	group2=7;
			    	 	    	//System.out.print(6 + " vs " +7 + " ");
		    	 	    	}
		    	 	    }					   			
		    	    }					    		
		    	}
		 	   
		 	   duree = duree+ Duree();
		    }	    	
	    	if(gagne1 == nombre && gagne2 ==nombre)
	    	{
	    		AjoutSet(match,group1,group2,total);
	    		group1=0;
		    	group2=0;
		    	scoore=0;
		    	sortie=0;
		    	resultat1=0;
		    	resultat2=0;
	    		sortie=0;
	    		total++;
	    		//System.out.print("Set "+ total + " : ");
	    		while(sortie ==0) // pour les macth 3 et 5 final
	    	    {					    	    	
	    	    	scoore = ThreadLocalRandom.current().nextInt(4); 
	    	    	 if( scoore == 0 || scoore == 1 )
				 		{
				 	    	group1++;
				 		}
				 	    else
				 	    {
				 	    	group2++;
				 	    }
	    	 	    if(group1 ==6 && group2 <5 )
	    	 	    {
	    	 	    	sortie=1;
	    	 	    	gagne1++;
	    	 	    	//System.out.print(group1 + " vs " +group2 + " ");
	    	 	    }
	    	 	    else if(group2 == 6 && group1 <5)
	    	 	    {
	    	 	    	sortie=1;
	    	 	    	gagne2++;
	    	 	    	//System.out.print(group1 + " vs " +group2 + " ");
	    	 	    }
	    	 	   else if (group1 >5 && group2 >5)
	    	 	    {
	    	 	    	resultat1= group1-group2;
	    	 	    	resultat2= group2-group1;
	    	 	    	if(resultat1 ==2)
		    	 	    {
		    	 	    	sortie=1;
		    	 	    	gagne1++;
		    	 	    	group1=6;
		    	 	    	group2=7;
		    	 	    	//System.out.print(7 + " vs " + 6 + " ");
		    	 	    }
	    	 	    	else if(resultat2 == 2)
	    	 	    	{
	    	 	    		sortie=1;
	    	 	    		gagne2++;
	    	 	    		group1=6;
		    	 	    	group2=7;
		    	 	    	//System.out.print(6 + " vs " +7 + " ");
	    	 	    	}
	    	 	    }
	    	    }
	    		
	    		duree = duree+ Duree();
	    	}
	    	else if( gagne1 == 1 && gagne2 ==0  || gagne1 == 0 && gagne2 ==1 )
	    	{
	    		sortie=0;
	    	}
	    	else if(nombre == 2 && gagne1 == 2 && gagne2 <2 || nombre == 2 && gagne1 < 2 && gagne2 ==2 || nombre == 2 && gagne1 == 1 && gagne2 == 1)
	    	{
	    		sortie=0;
	    	}
	    	AjoutSet(match,group1,group2,total);
	    }
	    Affichage_temp(duree,match);	
	    AjoutDivers(match,type);  
	    MatchDao matchDao = new MatchDao(JVConnection.getInstance());
		if(matchDao.create(match)==true)
		{
			//System.out.println("ok");
		}
	    if(group1 >group2)
	    {	   
	    	
	    	return 1;
	    }
	    else
	    {	    	
	    	return 0;
	    }
	    
	}
	
	
	public void Affichage_temp(int duree,Match match)
	{
		int min=0,sec=0;
		min=duree/60;
		sec=duree%60;
		match.setDuree("Le mache a durée "+min +" min et " +sec+" seconde");

	}
	public void AjoutSet(Match match,int group1 ,int groupe2,int set)
	{
		//System.out.println("set en question " +set + " point 1 " +group1+" point groupe 2 : " +groupe2);
		if(set ==1)
		{			
			match.setSet1(group1+"/"+groupe2);
			
		}
		else if(set ==2)
		{
			match.setSet2(group1+"/"+groupe2);
			
		}
		else if(set ==3)
		{
			match.setSet3(group1+"/"+groupe2);
			
		}
		else if(set ==4)
		{
			match.setSet4(group1+"/"+groupe2);
			
		}
		else if(set ==5)
		{
			match.setSet5(group1+"/"+groupe2);
			
		}
	}
	

	public void AjoutDivers(Match match, int type)
	{
		int condition;
		if(type ==0 || type ==1)
		{
			condition =0;
		}
		else if(type ==2 || type == 3)
		{
			condition =1;		
		}
		else
		{
			condition =2;
		}
	
		if(sum == 4) 
		{ 
			if((total)%28!=0)
				{
				tableaudate[condition]=tableaudate[condition].plusHours(2);	
				}
			
			else tableaudate[condition]=tableaudate[condition].plusHours(12); 
			sum =0;
		}
		total++;
		sum++;
		if(type == 0 || type==2 || type == 4)
		{
			if(sum==1 )
			{
				Arbitre(match);
			    Court(match);
			    drag=1;
			}
		}
		
			
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String date = tableaudate[condition].format(formatter);
		match.setDate(date);
		if(drag ==0)
		{
			
			List<Integer> listarbitre = new ArrayList<Integer>();
			List<Integer> listcourt = new ArrayList<Integer>();
			for(int i = 0; i<List().size();i++)
			{	
				if(List().get(i).GetDate().contentEquals(match.GetDate()))
				{	listarbitre.add(List().get(i).getArbitree().getId());
					listcourt.add(List().get(i).getCourt());
				}
			}
			Arbitre arb = new Arbitre();
			arbitre=arb.Arbitre_Match(listarbitre);
			match.setArbitree(arbitre);
			Court cour = new Court();
			court=cour.Court_Match(listcourt);
			match.setCourt(court);		
		}
		drag=0;
	}
	

	private void Court(Match match) {
		Court cour = new Court();
		court=cour.ajout();
		match.setCourt(court);		
	}

	

	public void Arbitre(Match match )
	{
		Arbitre arb = new Arbitre();
		arbitre=arb.ajoutMatch();
		match.setArbitree(arbitre);
	}
	
	public static List<Match> List()
	{
		MatchDao matchDao = new MatchDao(JVConnection.getInstance());
		return matchDao.list();
	}
}