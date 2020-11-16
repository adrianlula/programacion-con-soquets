package areglos;

import java.util.Scanner;

public class d2 {

	public static void main(String[] args) {
		int numero1,numero2,arreglo1[],arreglo2[],arreglo3[];
		Scanner escan = new Scanner(System.in);
		System.out.println("cuantos numeros quieres en el arreglo 1?");
		numero1=escan.nextInt();
		arreglo1=new int[numero1];
		for(int i=0;i<numero1;i++){
			System.out.println("introduce el numero "+(i+1));
			arreglo1[i]=escan.nextInt();
		}
		System.out.println("cuantos numeros quieres en el arreglo 2?");
		numero2=escan.nextInt();
		arreglo2=new int[numero2];
		for(int i=0;i<numero2;i++){
			System.out.println("introduce el numero "+(i+1));
			arreglo2[i]=escan.nextInt();
		}
		int suma=numero1+numero2;
		arreglo3=new int[suma];
		int p1=0,p2=0;
		for(int i=0;i<suma;i++){
			if(arreglo1[p1]>arreglo2[p2]){
				arreglo3[(suma-1)-i]=arreglo1[p1];
				if(p2<numero1){
					p2++;
				}
				
			}
			else{
				arreglo3[(suma-1)-i]=arreglo2[p2];
				if(p2<numero2){
					p2++;
				}
				
			}
			
			
		}
		
			
		
		
		
		
		
		for(int i=0;i<suma;i++){
			System.out.println(arreglo3[i]);
			
		}
		

	}

}
