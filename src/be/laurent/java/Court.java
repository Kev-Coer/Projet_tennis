package be.laurent.java;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Court {
	
	
		private int tab[]={1,2,3,4,5,6,7,8,9,10};
		
		
	public int ajout()
	{		
		int arbi = ThreadLocalRandom.current().nextInt(tab.length);
		return tab[arbi];	
	}

	public int Court_Match(List<Integer> listcourt) {
		int drag =0;
		int i=0,a=0,total =1;
		
		while(total <listcourt.size() )
		{
			total++;
			while(tab[a]!=listcourt.get(i) && drag ==0)
			{
				++i;
				if(i== listcourt.size())
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
		return tab[a];
	}
}
