package org.projectsHyr;

import java.io.*;
import java.util.Scanner;

public class csvFile {
	public static void main(String[] args) throws Exception {
//parsing a CSV file into Scanner class constructor  
		Scanner sc = new Scanner(new File("C:\\Users\\DinnuBunny\\Downloads\\Book1.csv"));
		sc.useDelimiter(","); // sets the delimiter pattern
		while (sc.hasNext()) // returns a boolean value if next line has values
		{
			System.out.print("| " +sc.next()+ " "); // find and returns the next complete token from this scanner
		}
		
		sc.close(); // closes the scanner
	}
}