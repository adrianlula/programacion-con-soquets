package areglos;

import java.util.ArrayList;
import java.util.Scanner;

public class uno {

	public static void main(String[] args) {
		
		int numeros,arreglo[],pos,aux;
		Scanner escan = new Scanner(System.in);
		System.out.println("cuantos numeros quieres areglar?");
		numeros=escan.nextInt();
		
		arreglo=new int[numeros];
		for(int i=0;i<numeros;i++){
			System.out.println("introdusca el numero "+(i+1));
			arreglo[i]=escan.nextInt();
		}
		
		
		for(int i=0;i<numeros;i++){
			pos=i;
			aux=arreglo[i];
			while(pos>0&&(arreglo[pos-1]>aux)){
				arreglo[pos]=arreglo[pos-1];
				pos--;
			}
			arreglo[pos]=aux;
		}
		System.out.println("ordenado ");
		for(int i=0;i<numeros;i++){
			System.out.println(arreglo[i]);
		}
		

	}

}
