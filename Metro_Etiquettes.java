import java.util.Scanner;
public class Metro_Etiquettes{
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("WELCOME TO ROORKEE METRO RAIL CORPORATION!");
        mainMenu();
    }
       
    public static void mainMenu(){
    	Scanner in = new Scanner(System.in);
        System.out.println("Choose one of the following options(numbers):\n1.Ticket Booking\n2.Metro Timings\n3.Metro Fares\n4.Contact us");
        int click = in.nextInt();
        switch(click){
        	case 1:
        		ticketTypes();
        		break;
        	case 2:
        		Timings.timings_main();
        		break;
        	case 3:
        		Fares.Fare_main();
        		break;
        	case 4:
        		Contact.address();
        		break;
        	default:
        		try{
        			throw new InvalidOptionException("You entered a wrong option");
        		}catch(InvalidOptionException e){
        			System.out.println(e);
       			}
    	} 
    }
    public static void ticketTypes(){
    	System.out.print("Types of Ticket Booking:\n1.Tockens\n2.Metro Travel Card(Smart Card)\n3.Group Ticket\n4.Trip Ticket");
    	Scanner in = new Scanner(System.in);
    	System.out.println("\nChoose an option:");
    	int type = in.nextInt();
    	switch(type){
    		case 1:
    			Tockens.tocken();
    			break;
    		case 2:
    			MetroCard.SCard();
    			break;
    		case 3:
    			GTicket.grpTicket();
    			break;
    		case 4:
    			TripTicket.trip();
    			break;
    		default:
    			try{
    				throw new InvalidOptionException("Choice not in option!");
    			}catch(InvalidOptionException e){
    				System.out.println(e);
    			}
    	}
    	
    }
}
