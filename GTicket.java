

import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class GTicket {
    public static void grpTicket()
    {
       	Scanner in= new Scanner (System.in);
     	System.out.println("GROUP TICKET\nThis is a paper ticket issued for a group of 4 to 25 persons.The group ticket is a single journey ticket.\nYou get 5% off in fare on group ticket. ");
    	int nop;
    	System.out.println("Enter no. of persons");
    	nop=in.nextInt();
    	if(nop>25 || nop < 4){
    		System.out.println("Invalid option.This ticket is issued only for a group of less than 25 people.\nRetrieving...");
    	 	grpTicket();
    	}
    	int route = Routes.route();  
		int[] stns = Fares.station(route);
    	Fares.displayFare(Fares.fare(stns[0],stns[1],5)); 
    } 
    
    
}