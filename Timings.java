
import java.util.Scanner;
public class Timings {
	public static void display_1() // displays the time schedule for Route 1
	{
	    System.out.println("1	Saharanpur        		10:00");
	    System.out.println("2	Shahpur           		10:14"); 
		System.out.println("3	Rampur            		10:22");
		System.out.println("4	Shafipur          		10:30");
		System.out.println("5	Roorkee(Civil lines)    10:38");
		System.out.println("6	Mohanpura               10:45");
		System.out.println("7	Akashdeep Enclave       10:51");
	 	System.out.println("8	Talhedi                 11:00");
	 	System.out.println("The given schedule repeats itself every 10 minutes..");
	}
	public static void display_2()  // displays the time schedule for Route 2
	{
		System.out.println("1    Brahmpuri              09:30");
		System.out.println("2    Haridwar               09:38");
		System.out.println("3    Devpura                09:45");
		System.out.println("4    Mayapura				09:52");
		System.out.println("5    Patanjali Yogpeeth		10:03");
		System.out.println("6    Adarsh Nagar			10:12");
		System.out.println("7    IITR(Gate no. 1)		10:20");
		System.out.println("8	 Roorkee(Civil lines)	10:22");
		System.out.println("9    Mohanpura				10:29");
		System.out.println("10   Akashdeep Enclave		10:35");
		System.out.println("11   Talhedi				10:44");	
		System.out.println("The given schedule repeats itself after every 10 minutes.");
	}
	public static void timings_main(){ // asks for route and then displays the timings
		Scanner input = new Scanner(System.in);
		System.out.println("METRO TIMINGS\nRoute 1: Saharanpur to Talhedi");
		System.out.println("Route 2: Brahmpuri  to Talhedi");
		System.out.println("Enter Route number");
		int m = input.nextInt();
	    System.out.println("Sr.  Station                 Time");
	    System.out.println("no    name                       ");
		switch(m)
		{
			case 1: display_1();
					break;
			case 2: display_2();
					break;
			default:System.out.println("\nEnter correct Route number!");
		}
		Scanner in = new Scanner(System.in);
    	int a=0;
    	System.out.println("\nPress any non zero integer to Return to main menu.");
    	a = in.nextInt();
    	if(a !=0)
    		Metro_Etiquettes.mainMenu();
    	else{
    		System.out.print("Wrong choice!\nSystem is terminating.....\n..\nTerminated.");
    	}
	}// closes timings_main
} // closes Timings (class)
