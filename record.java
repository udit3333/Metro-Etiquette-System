import java.io.*;
import java.util.*;
public class record implements Serializable {
		private String name,gender;
		private int age,IDcode;
		private double balance;

	public void setvalue(){
		Scanner in	= new Scanner(System.in);
		String	w="",s="";
		System.out.print("Enter the following details.\nName:");
		name=in.nextLine();
		System.out.print("Gender(M/F):");
		gender=in.nextLine();
		System.out.print("Age:");
		age=in.nextInt();
		System.out.print("Enter	the	balance	that you would like	to add in your card:");
		balance=in.nextDouble();
		try{
			FileReader a=new FileReader("roll.txt");
			BufferedReader b=new BufferedReader(a);
			if((s=b.readLine())!=null){
				w=s;
			}
		b.close();
		}catch(Exception e){
			IDcode=1;
		}

		IDcode=Integer.parseInt(w);
		System.out.println("Your Smart Card Unique IDcode is "+IDcode);
		try{
			FileWriter a=new FileWriter("roll.txt");
			PrintWriter	b=new PrintWriter(a);
			b.println(IDcode+1);
			b.close();
		}catch(Exception e){}
		
	}
	
	public String getName(){
		return(name);
	}
		
	public String getGender(){
		return(gender);
	}
		
	public int getAge(){
		return(age);
	}
		
	public int getIDcode(){
		return(IDcode);
	}
		
	public double getBalance(){
		return(balance);
	}
		
	public void updateBalance( double rec){
		balance-=rec;
	}
}