package paguinasweb;

import java.util.Scanner;

public class combinatoria5 {

	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		int a,b,a1=1,b1=1,c,c1=1;
		float d;
		System.out.println("introducir 2 numeros");
		a=escan.nextInt();
		b=escan.nextInt();
		for(int i=1;i<a;++i){
			a1=a1+a1*i;
		}
		for(int i=1;i<b;++i){
			b1=b1+b1*i;
		}
		c=a-b;
		for(int i=1;i<c;++i){
			c1=c1+c1*i;
		}
d=a1/(b1*c1);
System.out.println("la combinatoria es de: "+d);
	}

}
