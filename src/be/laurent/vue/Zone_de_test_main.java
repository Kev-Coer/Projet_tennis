package be.laurent.vue;

import be.laurent.java.Ordonnancement;
import be.laurent.java.Tournois;

public class Zone_de_test_main {

	public static void main(String[] args) {
		System.out.println("Macth contre");
		Tournois tour= new Tournois("Match");
		Ordonnancement Ordon =new Ordonnancement();
		Ordon.Start(tour);
		/*Match test= new Match();

		for (Match customer : test.List()) {
			
			System.out.println(customer.getArbitree().getId());
	    }*/		
	}
}
