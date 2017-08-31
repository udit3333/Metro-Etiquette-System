
import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Tockens{

    public  static void tocken()
    {
    	Scanner in= new Scanner (System.in);
    	System.out.println("TOCKEN SYSTEM\nTokens are used as single journey tickets.These are captured at exit gates.");
    	String name,gender="";
    	int age;
    	System.out.println("Enter your name");
    	name=in.nextLine();
    	 	
    	System.out.println("Enter m for male and f for female:");
    	gender=in.nextLine();
    /*	try{
    		int g= Integer.parseInt(gender);
    		if(g== m||g==f||g==M||g==F){*/
	    	 	System.out.println("Enter your age");
    		 	age=in.nextInt();
    			if(age !=0){
    	 			int route = Routes.route();
					int[] stns = Fares.station(route);
					Fares.displayFare(Fares.fare(stns[0],stns[1],0));
					System.out.println("Enjoy your journey!");
    	 		}
    	/*	}else{
    	 			throw new MismatchException("Gender code does not match!");
    	 		}
    	}catch(MismatchException mis){
    	 	System.out.println(mis);
    	} */
    } // closes tocken()
} // closes Tockens (class)
    
    
    
    
    
    
