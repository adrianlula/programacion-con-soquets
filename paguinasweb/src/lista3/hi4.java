package lista3;

import java.util.Scanner;

public class hi4 {

	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		String cadena;
		int numero;
		char[] alfabeto;
		alfabeto=new char[26];
		alfabeto[0]='a';
		alfabeto[1]='b';
		alfabeto[2]='c';
		alfabeto[3]='d';
		alfabeto[4]='e';
		alfabeto[5]='f';
		alfabeto[6]='g';
		alfabeto[7]='h';
		alfabeto[8]='i';
		alfabeto[9]='j';
		alfabeto[10]='k';
		alfabeto[11]='l';
		alfabeto[12]='m';
		alfabeto[13]='n';
		alfabeto[14]='ñ';
		alfabeto[15]='o';
		alfabeto[16]='p';
		alfabeto[17]='q';
		alfabeto[18]='r';
		alfabeto[19]='s';
		alfabeto[20]='t';
		alfabeto[21]='u';
		alfabeto[22]='v';
		alfabeto[23]='w';
		alfabeto[24]='x';
		alfabeto[25]='y';
		alfabeto[26]='z';
		char[] dijitos;
		dijitos=new char[10];
		for(int i=0;i<=10;i++){
			dijitos[i]=(char) i;
			System.out.println(dijitos[i]);
		}
		System.out.println("introduce una cadena");
		cadena=escan.nextLine();
		System.out.println("introduce un numero");
		numero=escan.nextInt();
		

		

	}

}
