
import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class Fares{
	
	public static void Fare_main(){ 
		System.out.println("METRO FARES");
		Scanner in = new Scanner(System.in);
		int route = Routes.route(); //asks for route number
		int[] stns = station(route); // asks for station codes
		displayFare(fare(stns[0],stns[1],0)); // displays the fare
	
    	int a=0;
    	System.out.println("\nPress any non zero integer to Return to main menu.");
    	a = in.nextInt();
    	if(a !=0)
    		Metro_Etiquettes.mainMenu();
    	else{
    		System.out.print("Wrong choice!\nSystem is terminating.....\n..\nTerminated.");
    	}
	}//closes Fare_main
	
	public static double fare(int a,int b,int c){ // calculates fare 
		double f = 8*Math.abs(a-b)*(100-c)/100; // c is the % concession,a and b are station codes
		return f;
	}//fare
	
	public static void displayFare(double f){
		System.out.println("The fare for the given journey is "+f+" rupees.");	
	}//closes displayFare
	
	public static int[] station(int a){ 
		int[] statn = new int[2];
		Scanner in = new Scanner(System.in);
		if(a==1){
			try{
				BufferedReader b = new BufferedReader(new FileReader("C:\\Users\\Yajat\\Documents\\JCreator Pro\\MyProjects\\Metro Etiquettes\\Route_1.txt"));
				while(b.read()!= -1)
					System.out.println(b.readLine());
			
			}catch(Exception e){
			}// closes inner catch
		}// closes if
		else if(a==2){
			try{
				BufferedReader b = new BufferedReader(new FileReader("C:\\Users\\Yajat\\Documents\\JCreator Pro\\MyProjects\\Metro Etiquettes\\Route_2.txt"));
				while(b.read() != -1)
					System.out.println(b.readLine());
			}catch(Exception e){}
		}// closes second if
		else{
			System.out.println("Retry!(Enter a valid route no.)");
			int route = in.nextInt();
			station(route);
		}// closes else
			try{
				System.out.print("Enter the Source code(source station no.):");
				statn[0] = in.nextInt();
				if(statn[0] <1 || statn[0] > 11){
					throw new InvalidOptionException();
				}// closes if for statn[0]
				System.out.print("Enter the Destination code(destination station no.):");
				statn[1] = in.nextInt();
				if(statn[0] <1 || statn[0] > 11){
					throw new InvalidOptionException();
				}// closes if for statn[1]
			}catch(InvalidOptionException e){
				System.out.println(e);
				System.out.println("Wrong station code!RETRY.");
				station(a);
				
			}// closes catch
			
		return statn; // returns the station codes
	}// closes station()
}// closes main program(Fares)