package lista3;

import java.util.Scanner;

public class h2 {

	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		String linea;
		String flotan;
		String salida;
		int sus=0;
		char vacio=' ';
		System.out.println("introduce una cadena");
		linea=escan.nextLine();
		for(int i=0;i<linea.length();i++){
			flotan=linea;
			if
				(linea.charAt(i)==vacio){
				
				salida=flotan.substring(sus, i);
				sus=i;
				
				System.out.println(salida);
			}
			
		}
		

	}

}
