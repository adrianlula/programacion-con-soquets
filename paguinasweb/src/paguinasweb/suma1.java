package paguinasweb;

import java.util.Scanner;

public class suma1 {

	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		int numero1;
		System.out.println("introducir numero");
		numero1=escan.nextInt();
		
			
		int numero,numero2=0;
			numero=numero1;
		if(numero>=0){
		for(int i=1;i<=numero;i++){
		if(numero%i==0){
			numero2=i+numero2;
		}
		}
		System.out.println("el resultado de la suma es: "+numero2);
	}	
		
		
	
	}
}
