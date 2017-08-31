
import java.io.*;
import java.util.*;
public class MetroCard{

	public static void SCard(){
		int choice=0;
		Scanner in =new Scanner(System.in);
		System.out.print("METRO TRAVEL CARD cum SMART CARD\nThis card stores some amount of money and through this you can travel without buying tokens.");
		System.out.print("Every time you use this, corresponding amount of money (with 10% concession) will get deducted.\n");
		System.out.print("The card can also be topped up whenever it does not have sufficient amount.\n");
		System.out.println("Press 1 for New smart card.");
		System.out.println("Press 2 to  Check your balance.");
		System.out.println("Press 3 to  Return your card.");
		System.out.println("Press 4 to  Swipe your Smart card for journey.");
		System.out.println("Press 5 to go to Main Menu.");
		choice=in.nextInt();
		switch(choice){
			case 1:
				NewCard.newCard();
				break;
			case 2:
				balancecheck();
				break;
 			case 3:
				returncard();
				break;	
			case 4:
				journey();
				break;
			case 5:
				System.out.println("MAIN MENU");
				Metro_Etiquettes.mainMenu();
				break;
			default:
				try{
 	   				throw new InvalidOptionException("Choice not in option!");
    			}catch(InvalidOptionException e){
    				System.out.println(e);
    			}finally{
					break;
    			}
		}
	}
	
	public static void balancecheck(){
		int givencode,c=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Unique IDcode of your smart card:");
		givencode=in.nextInt();

		try{
			FileInputStream x= new FileInputStream("rec.txt");
			ObjectInputStream y = new ObjectInputStream(x);
			try{
				while(true){
					record z = new record();
					z=(record)y.readObject();
					if(z.getIDcode()==givencode){
						System.out.println("Name ="+z.getName());
						System.out.println("Age ="+z.getAge());
						System.out.println("Gender ="+z.getGender());
						System.out.println("Balance ="+z.getBalance());
						c=1;
					}
				}// closes while
			}catch (Exception ex){}// closes inner catch
		}catch (Exception ex){
			ex.printStackTrace();
		} // closes outer catch
		try{
			if(c==0)
				throw new MismatchException();
		}catch(MismatchException e){
				System.out.println(e);		
		}
	}
	
	public static void returncard(){
		int givencode;
		double bal;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Unique IDcode of your Smart card:");
		givencode=in.nextInt();

		ArrayList<record> r=new ArrayList<record>();
		try{     
			FileInputStream x= new FileInputStream("rec.txt");
			ObjectInputStream y = new ObjectInputStream(x);
			int check =0;
			try{
				while(true){
					record z = new record();
					z=(record)y.readObject();
	  
					if(z.getIDcode()==givencode){
						bal=z.getBalance();
	/*Why negative?*/	if(bal<-50){
							double t;
							t=(-bal)-50;
							System.out.println("You have to pay "+t);
						}else{
							double a;
							a=bal+50;
							System.out.println("We pay you "+a);
						}
						check = 200;
					}else
						r.add(z);;
				}
			}catch(Exception ex) {
				ex.printStackTrace();
			}finally{
				x.close();
			}
			if(check == 0)
				System.out.println("Wrong IDcode!");
			
			try{
				FileOutputStream x1= new FileOutputStream("rec.txt");
				ObjectOutputStream y1= new ObjectOutputStream(x1);
				for(record re:r){
					y1.writeObject(re);
				}
				y1.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}catch(Exception e){}
	}

	public static void journey(){
		Scanner in = new Scanner(System.in);
		int givencode;
		double f=10.0;
		int route = Routes.route();  
		int[] stns = Fares.station(route);
		f = Fares.fare(stns[0],stns[1],10);
    	Fares.displayFare(f); 
		System.out.println("Enter the IDcode of Smart card:");
		givencode=in.nextInt();

		ArrayList<record> r=new ArrayList<record>();
		try{
     
			FileInputStream x= new FileInputStream("rec.txt");
			ObjectInputStream y = new ObjectInputStream(x);
			try{
				while(true){
					record z = new record();
					z=(record)y.readObject();
					if(z.getIDcode()==givencode){
						z.updateBalance(f);
						if(z.getBalance()>+0)
							System.out.print("Your new balance is "+z.getBalance());
					}
					r.add(z);
				}
			}catch(Exception ex){}
			x.close();

			FileOutputStream x1= new FileOutputStream("rec.txt");
			ObjectOutputStream y1= new ObjectOutputStream(x1);
			for(record re:r){
				y1.writeObject(re);
			}
			y1.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}
}
























