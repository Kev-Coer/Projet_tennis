package be.laurent.java;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import be.laurent.dao.ArbitreDao;
import be.laurent.dao.JVConnection;


public class Arbitre extends Personne{
	private int id;
	private int carrier;
	
	public Arbitre(int id,int carrier ) {
		this.id =id;
		this.carrier = carrier;

	}
	public Arbitre(int carrier ) {
		
		this.carrier = carrier;

	}
	public Arbitre(int id,int carrier,String nom, String prenom, Integer age, String sexe, String pays)
	{
		super(nom, prenom, age, sexe, pays);
		this.id=id;
		this.carrier=carrier;
	}
	
	public Arbitre(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCarrier() {
		return carrier;
	}

	public void setCarrier(int carrier) {
		this.carrier = carrier;
	}
	
	//Creation de la liste
	public  List<Arbitre> List()
	{
		ArbitreDao arbitreDao = new ArbitreDao(JVConnection.getInstance());
		return arbitreDao.list();
	}
	
	public Arbitre ajout(int arb)
	{
		int drag =0;
		int arbi =0;
		while(drag ==0)
		{
		arbi = ThreadLocalRandom.current().nextInt(List().size());
		
			if(List().get(arbi).getId() != arb)
			{
				drag=1;
			}
		}
		return List().get(arbi);
	
	}
	
	public Arbitre ajoutMatch()
	{
		int arbi = ThreadLocalRandom.current().nextInt(List().size()); //0 et 7
		return List().get(arbi);
	}
	public Arbitre Arbitre_Match(List<Integer> listarbitre) {
		int drag =0;
		int i=0,a=0,total=1;
		while(total <listarbitre.size())
		{ total++;
			while(drag ==0 && List().get(a).getId()!=listarbitre.get(i))
			{
				++i;
				if(i== listarbitre.size())
				{	
					drag =1;
					a++;
				}
			}
			i=0;
			if(drag==0)
			{
				a++;
			}
		}
		return List().get(a);
				
	}
}