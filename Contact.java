import java.util.Scanner;
public class Contact {

    public static void address(){
    
    	System.out.println("Address:\nRoorkee Metro Rail Corporation,\nFire bridge lane,");
    	System.out.println("Civillines Road,\nUttarakhand-247667,");
    	System.out.println("Telephone no.04023283550,");
    	System.out.println("email id:rmrcroorkee@gmail.com,");
    	System.out.println("Fax no.:53795748");
    	
    	Scanner in = new Scanner(System.in);
    	int a=0;
    	System.out.println("\nPress any non zero integer to Return to main menu.");
    	a = in.nextInt();
    	if(a !=0)
    		Metro_Etiquettes.mainMenu();
    	else{
    		System.out.print("Wrong choice!\nSystem is terminating.....\n..\nTerminated.");
    	}	
    }
      
}