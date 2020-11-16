package areglos;

import java.util.Scanner;

public class s3 {

	public static void main(String[] args) {
		int[][] matris1;
		int[][] matris2;
		int[][] matris3;
		int ancho,ancho2;
		int largo,largo2;
		Scanner escan = new Scanner(System.in);
		System.out.println("introducir tamaño de matris");
		System.out.println("ancho");
		largo=escan.nextInt();
		System.out.println("largo");
		ancho=escan.nextInt();
		System.out.println("introducir matris");
		matris1=new int[largo][ancho];
		for(int i=0;i<largo;i++){
			for(int j=0;j<ancho;j++){
				matris1[i][j]=escan.nextInt();
			}
			
		}
		System.out.println("introducir tamaño de matris 2");
		System.out.println("ancho");
		largo2=escan.nextInt();
		System.out.println("largo");
		ancho2=escan.nextInt();
		System.out.println("introducir matris 2");
		matris2=new int[largo2][ancho2];
		for(int i=0;i<largo2;i++){
			for(int j=0;j<ancho2;j++){
				matris2[i][j]=escan.nextInt();
			}
			
		}
		for(int i=0;i<largo;i++){
			for(int j=0;j<ancho;j++){
				System.out.print(matris1[i][j]);
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<largo2;i++){
			for(int j=0;j<ancho2;j++){
				System.out.print(matris2[i][j]);
				
			}
			System.out.println();
		}
		int menu;
		System.out.println("que desea realisar, precione");
		System.out.println("1 para sumar");
		System.out.println("2 par multiplicar");
		System.out.println("3 par la inversa");
		menu=escan.nextInt();
		switch(menu){
			case 1:
				if(ancho==ancho2&&largo==largo2){
					matris3=new int[ancho][largo];
					for(int i=0;i<largo;i++){
						for(int j=0;j<ancho;j++){
							matris3[i][j]=matris1[i][j]+matris2[i][j];
						}
					}
					System.out.println("la suma queda como");
					for(int i=0;i<largo;i++){
						for(int j=0;j<ancho;j++){
							System.out.print(matris3[i][j]);
						}
						System.out.println();
					}
					
				}else
					System.out.println("la operacion no se puede realizar");
				break;
			case 2:
				if(largo==ancho2){
					matris3=new int[largo2][ancho];
					int sumatoria;
					for(int i=0;i<largo2;i++){
						for(int j=0;j<ancho;j++){
							
							
							
						}
					}
				}
				break;
		}
	}

}
