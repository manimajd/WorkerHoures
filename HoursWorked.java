/*
									read file

Created by:		Mani Majd
Date:			August 8th 2017
Purpose:		Training

*/

import java.io.*;
import java.util.*;
public class HoursWorked {

	public static void main (String[] args) {

		try {
			Scanner input = new Scanner (new File("hours.txt"));
			readFile(input);
		
		} catch (FileNotFoundException error) {

			System.out.println("could not find the file");
		}
		
	}//end of main


	public static void readFile(Scanner input){
		Scanner console = new Scanner(System.in);
		System.out.println("Enter an ID = ?");
		int employeeID = console.nextInt();
		boolean foundID = false; // Do we found the person?

		while(input.hasNextLine()){				// process for each employee
			
			// line = "123 Susan 12.5 8.17 7.6 3.2 0.0"
			String line = input.nextLine();
			Scanner lineScan = new Scanner(line);
			
			
			int id = lineScan.nextInt();
			if (id==employeeID){
				foundID = true;
				String name = lineScan.next();
				double totalHoures = 0.0;
				int day = 0;
				
				while (lineScan.hasNextDouble()){
					totalHoures += lineScan.nextDouble();
					day++;
				}
				
				System.out.printf("%s%s%.2f%s%.2f%s",name, " worked ", totalHoures, " hours (" , totalHoures/day, " hours/day)");
//				System.out.println(name+" worked "+ totalHoures+ " hours (" + totalHoures/day+ " hours/day)");
			}
			}// end of wile loop
		
		if(!foundID){
			System.out.println("ID# "+ employeeID + " not found.");
		}
		
		
		
	}
}
