package Java;

import java.util.ArrayList;

public class StringOccurenceEqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a Program Input String countries
		 * ="India,USA,UK,INDIA,uk,Russia,Russia,China" Output: - India: 2 USA:1 UK:2
		 * Russia:2 China:1
		 */

		String countries = "India,USA,UK,INDIA,uk,Russia,Russia,China";
		String[] str = countries.split(",");
		//String[] str = {"India","uk","INDIA"};
		
		for(int i=0;i<str.length;i++)
		{
			int count =0;
			
			for(int j=i;j<str.length;j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					count = count+1;
				}
			}
			
			System.out.println(str[i]+";"+count);
		}

	}
}
