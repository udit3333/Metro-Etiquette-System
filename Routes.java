
import java.io.*;
import java.util.Scanner;
public class Routes {

    public static void routeMap(){
    	try{
			FileReader f = new FileReader("C:\\Users\\Yajat\\Documents\\JCreator Pro\\MyProjects\\Metro Etiquettes\\Route.txt");
			BufferedReader b = new BufferedReader(f);
			while(b.read()!= -1){
				System.out.println(b.readLine());
			}
			b.close();
		}catch(Exception e){
				System.out.println("Map can not be shown right now.Please try again later.");
		}
    }
    
	public static int route(){
		Scanner in = new Scanner(System.in);
		System.out.println("Route 1: Saharanpur to Talhedi");
		System.out.println("Route 2: Brahmpuri  to Talhedi\n(To see full routes,Enter 0.)");
		System.out.println("Enter Route number:");
		int r = in.nextInt();
		if(r== 0){
			routeMap();
			route();
		}
		return r;
	}
}