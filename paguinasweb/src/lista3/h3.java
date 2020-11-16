package lista3;

import java.util.Scanner;

public class h3 {

	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		String linea;
		
		System.out.println("introduce una contraseña");
		linea=escan.nextLine();
		if(linea.length()<8){
			System.out.println("contraseña invalida");
		}
		

	}

}
