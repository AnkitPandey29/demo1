package Java;

import org.testng.annotations.Test;
import java.util.*;

public class ArrayListLearning {
	
	
	public void declareArrayList()
	{
		
	//	ArrayList al = new ArrayList ();
	//	ArrayList<String> ab = new ArrayList<String>();
		//List al = new ArrayList();
		
	}
	@Test
	public void addElementToArrayList()
	{
		ArrayList al = new ArrayList ();
		al.add("Ankit");
		al.add('A');
		al.add(45);
		al.add(65.8);
		al.add(true);
		System.out.println(al);
		//size
		int ab = al.size();
		System.out.println(ab);
		
		//removeElement
		al.remove(1);
		System.out.println(al);
		
		//addElement in specefic index
		al.add(1, "i am ankit");
		System.out.println(al);
		
		//upadate/replace existing index with new value
		al.set(1, "i am ankit pandey");
		System.out.println(al);
		
		//search-contains()-return true false
		
		System.out.println(al.contains("Ankit"));
		
		//for Loop
		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
		
		
		//for each loop
		
//		for(Object ob : al)
//		{
//			System.out.println(ob);
//		}
		
		//iterator
		
		Iterator it  = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//int Array to ArrayList
		
		Integer[] a = {5,2,3};//--doubt int array to list
		
		//Sort String
		//String[] a = {"A","X","M"};
 		ArrayList as = new ArrayList(Arrays.asList(a));
 		Collections.sort(as);
 		//descending
 		//Collections.sort(as,Collections.reverseOrder());
		System.out.println(as);
		
			
	}

}
