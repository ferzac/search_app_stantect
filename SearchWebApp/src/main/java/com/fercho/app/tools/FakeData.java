/**
 * 
 */
package com.fercho.app.tools;

import java.util.Random;

/**
 * @author ferzac
 * @version 1.0.0
 * Class to generate fake data
 */
public class FakeData 
{
	String names[]={"Maia","Asher",
			"Olivia","Atticus",
			"Amelia","Jack",
			"Charlotte","Theodore",
			"Isla","Oliver",
			"Isabella","Jasper",
			"Ava","Silas",
			"Allegro","Milo",
			"Aurora","Wyatt",
			"Evelyn","Henry"};
	String lastNames[] = {"SMITH","JOHNSON",
			"WILLIAMS","BROWN",
			"JONES","MILLER",
			"DAVIS","GARCIA",
			"RODRIGUEZ","WILSON",
			"MARTINEZ","ANDERSON",
			"TAYLOR","THOMAS",
			"HERNANDEZ","MOORE",
			"MARTIN","JACKSON",
			"THOMPSON","WHITE"};
	String emailDomain[] = {"hotmail.com","gmail.com","tester.com"};
	String street[] = {"Main Street","Avenue","Main Ave"};
	String idLetter[] = {"AZ","BY","XC"};
	String nameEmail ="";
	final String postalCode = "T5T 5T5";
	final String country = "Canada";
	final int random1 = 3;
	final int random2 = 20;
	final int random3 = 1000;
	final int random4 = 10000;
	
	public int indexNum(int i)
	{
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(i);
	}
	
	public String name()
	{
		nameEmail = names[indexNum(random2)]+" "+lastNames[indexNum(random2)]; 
		return nameEmail;
	}
	
	public String email()
	{
		if (nameEmail.isEmpty())
			return names[indexNum(random2)]+"."+lastNames[indexNum(random2)]+"@"+emailDomain[indexNum(random1)];
		else
			return nameEmail.replace(" ", ".")+"@"+emailDomain[indexNum(random1)];
	}
	
	public String address()
	{
		return indexNum(random3)+" "+street[indexNum(random1)]+", "+postalCode+", "+country;
	}
	
	public String phone()
	{
		return indexNum(random3)+"-"+indexNum(random3)+"-"+indexNum(random4);
	}
	public String id()
	{
		return indexNum(random3)+idLetter[indexNum(random1)]+indexNum(random3);
	}
}
