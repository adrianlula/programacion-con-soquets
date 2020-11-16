package paguinasweb;

import java.util.Scanner;

public class c20 {

	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		double numero;
		double divide=2;
		double resultado=1;
		System.out.println("introduce n");
		numero=escan.nextDouble();
		for(int i=0;i<numero;i++){
			System.out.println(divide);
			resultado=resultado+(1/divide);
			System.out.println(resultado);
			divide+=2;
		}
		System.out.println("el resultado es:  "+resultado);

	}

}
