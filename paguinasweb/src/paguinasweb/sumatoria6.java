package paguinasweb;

import java.util.Scanner;

public class sumatoria6 {

	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		int n;
		float acu = 5;
		System.out.println("introducir n");
		n=escan.nextInt();
		for(int i=1;i<n;i++){
			acu=acu+(1/3);
			System.out.println(acu);			
		}
		

	}

}
