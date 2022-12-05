package Java;

import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

public class HashSetPracticle {
	
	@Test
	public void removeDuplicate()
	{

		int a[]= {8,9,10,8,11,9,12,10};
		HashSet<Integer> hmp= new HashSet<Integer>();
		
		for(int i : a)
		{
			
			hmp.add(i);

		}
		
		Iterator<Integer> it = hmp.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
