package paguinasweb;

import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		int n,a,b,num=0,denominador=0;
		float x;
		System.out.println("introducir los valores de n,a,b");
		n=escan.nextInt();
		a=escan.nextInt();
		b=escan.nextInt();
		for(int i=1;i<=n;i++){
			int potencia=1;
			for(int j=1;j<=i;j++){
			potencia=potencia*(a-b);
			}
			num=num+potencia-3;
		
		}
	    num=num+n;
	    for(int i=2;i<=n-1;i++){
	    denominador=denominador+(2+a*(i-1));	
	    }
	    try{
	    x=num/denominador;
	    System.out.println("el resultado es: "+x);
	    }catch(ArithmeticException e){
	    	System.out.println("divicion entre cero");
	    }
	}

}
