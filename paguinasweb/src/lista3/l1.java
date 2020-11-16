package lista3;

import java.util.Scanner;

public class l1 {

	public static void main(String[] args) {
		String linea;
		char[] cadena;
		int vandera=0;
		cadena=new char[5];
		cadena[0]='a';
		cadena[1]='e';
		cadena[2]='i';
		cadena[3]='o';
		cadena[4]='u';
		Scanner escan = new Scanner(System.in);
		System.out.println("introduce una cadena");
		linea=escan.nextLine();
		for(int i=0;i<linea.length();i++){
			for(int j=0;j<cadena.length;j++){
				if
				(linea.charAt(i)==cadena[j]){
					System.out.println(linea.charAt(i));
					System.out.println("es vocal");
					vandera++;
				}
			}
			if(vandera==0){
				System.out.println(linea.charAt(i));
				System.out.println("es consonante");
			}
			vandera=0;
		}
		

	}

}
