package paguinasweb;

import java.util.Scanner;

public class capital2 {

	public static void main(String[] args) {
		float inicial,fin;
		int interes,a�os;
		Scanner escan = new Scanner(System.in);
		System.out.println("introducir saldo inicial");
		inicial=escan.nextFloat();
		System.out.println("introducir el porcenteje que da de interes");
		interes=escan.nextInt();
		System.out.println("introducir el numero de a�os");
		a�os=escan.nextInt();
		for(int i=0;i<a�os;i++){
		inicial=(float) (inicial+(inicial*(interes*0.01)));
		}
		
		System.out.println("el saldo final seria de: "+inicial);

	}

}
