package be.laurent.java;

public class Ordonnancement {
	private int idO;
	private int nbrSet;
	private String type;
	private int[][] equipe;
	private Tournois tournois;
	
	public int getIdO() {
		return idO;
	}
	public void setIdO(int idO) {
		this.idO = idO;
	}
	public int getNbrSet() {
		return nbrSet;
	}
	public void setNbrSet(int nbrSet) {
		this.nbrSet = nbrSet;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int[][] getEquipe() {
		return equipe;
	}
	public void setEquipe(int[][] equipe) {
		this.equipe = equipe;
	}
	public Tournois getTournois() {
		return this.tournois;
	}
	
	public void setTournois(Tournois tournois) {
		this.tournois = tournois;
	}

	
	
	public void Start(Tournois tournois)
	{
		Equipe_joueur j;
		int b;
		for(int i = 0 ; i <tournois.getTableauChaine().length;i++)
		{
			
			if(tournois.getTableauChaine()[i].contains("MS")||tournois.getTableauChaine()[i].contains("DS")) // 128
    		{
				equipe = new int[8][];
				equipe[0] = new int[128];
    		}
    		else
    		{
    			equipe = new int[6][];
    			equipe[0] = new int[32];
    		}
			b=0;
			Match cree = new Match();
    		for(int a = 1; a < 353; a++){
    			j = cree.Info(a);				
				if(j.getEquipe().getGenre().contentEquals(tournois.getTableauChaine()[i]))
				{
					equipe[0][b] = j.getEquipe().getIdE();
					b++;

				}
    		}
    		if(tournois.getTableauChaine()[i].contains("MS")||tournois.getTableauChaine()[i].contains("DS"))
    		{
    			Simple(i);
    		}
    		
    		else
    		{
    			Double(i);
    		}
		}
    }



	public void Simple(int type) 
	{
		int start =0;
		int fin;
		int idgagant;
		Match cree = new Match();
	    for (int i = 1; i < 8; i++) {
	    	equipe[i] = new int[(equipe[i-1].length)/2];
	    	fin = equipe[i-1].length;
    	
		for (int j = 0; j < equipe[i].length; j++) {
			idgagant= cree.CalculMacht(equipe[start][j],equipe[start][--fin],type); 
		    
			if( idgagant == 1)
			{
				equipe[i][j]= equipe[start][j];
			}
			else
			{
				equipe[i][j]= equipe[start][--fin];
			}
		}
		start++;
		fin--;
	    } 
	}
	
	public void Double(int type)
	{
			int start =0;
			int fin;
			int idgagant;
			Match cree = new Match();
		    for (int i = 1; i < 6; i++) {
		    	equipe[i] = new int[(equipe[i-1].length)/2];
		    	fin = equipe[i-1].length;
	    	
			for (int j = 0; j < equipe[i].length; j++) {
				idgagant= cree.CalculMacht(equipe[start][j],equipe[start][--fin],type); 
			    
				if( idgagant == 1)
				{
					equipe[i][j]= equipe[start][j];
				}
				else
				{
					equipe[i][j]= equipe[start][--fin];
				}
			}
			start++;
			fin--;
		    } 	
	}
}