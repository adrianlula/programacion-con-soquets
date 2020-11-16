package paguinasweb;

import java.util.Random;
import java.util.Scanner;

public class r19 {

	public static void main(String[] args) {
    int ran,basura;
    String respuesta;
    Random aja=new Random();
    
    
    Scanner escan = new Scanner(System.in);
    System.out.println("introduce un numero");
    basura=escan.nextInt();
    System.out.println("quieres volver a hacerlo?");
    respuesta=escan.next();
    String si="si";
    ran=aja.nextInt(10);
    System.out.println("lo aras "+ran+"veces");
    if(respuesta.equals(si)){
   for(int i=0;i<ran;i++){
	   System.out.println("introduce un numero");
	   basura=escan.nextInt();
   }

	}
	}

}
