import java.util.*;
import java.io.*;
public class NewCard {
	
  public static void newCard(){

	record rec = new record();
	rec.setvalue();
	ArrayList<record> recList =new ArrayList<record>();
	try{
		//reading the data
		FileInputStream x= new FileInputStream("rec.txt");
		ObjectInputStream y = new ObjectInputStream(x);
		try{
			while(true){	
			recList.add((record)y.readObject()); 
	  		}// closes while
		}catch(Exception e){}
		finally{
			x.close();	
			recList.add(rec);
		} 
		// writing the data
		FileOutputStream x1= new FileOutputStream("rec.txt");
		ObjectOutputStream y1= new ObjectOutputStream(x1);
		for(record re:recList){
			y1.writeObject(re);
		} // closes enhanced for loop
		y1.close();

		}catch(Exception ex){ // outer catch starts
			try{
				System.out.println("Retrying...");
				FileOutputStream x1= new FileOutputStream("rec.txt");
				ObjectOutputStream y1= new ObjectOutputStream(x1);
				y1.writeObject(rec);
			}catch(Exception e){
				e.printStackTrace();
			}// inner catch ends
		} // outer catch ends
	System.out.println("Going back to Metro Travel Card...");
	MetroCard.SCard();
	} // closes newCard() 
    
} // closes NewCard (class)