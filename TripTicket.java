import java.util.Scanner;


public class TripTicket {

	 public static void trip(){
	 	System.out.println("TRIP TICKET\nIt can be used for performing multiple journeys and is specially meant for regular commuters between two fixed stations.\n A Single journey from one station to the destination station is a TRIP. ");
	 	Scanner in = new Scanner(System.in);
	 	int disc =0; //discount
	 	int route = Routes.route(); //asks for route number
	 	Fares f = new Fares(); // for simplicity, an object of Fares is created
		int[] stns = f.station(route); // asks for station codes
		System.out.println("Enter the number of days:\n(Must be greater than 15.)");
		int n=in.nextInt();
		if(n>=15&&n<30){
			System.out.println("You get 5% discount on total fare.");
			disc = 5;
		}else if(n>=30&&n<90){
			System.out.println("You get 10% discount on total fare.");
			disc = 10;
		}else if(n>=90&&n<180){
			System.out.println("You get 15% discount on total fare.");
			disc = 15;
		}else if(n>=180){
			System.out.println("You get 20% discount on total fare.");
			disc = 20;
		}else{
			System.out.println("Insufficient number of days!");
		}
		double d = f.fare(stns[0],stns[1],disc);
		f.displayFare(2*n*d);
		System.out.println("Enjoy your journey!");
	}













}


