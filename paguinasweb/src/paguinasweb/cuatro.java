package paguinasweb;

public class cuatro {

	public static void main(String[] args) {
		int n=3,an;
		for(;;){
			an=n;
			an=an-1+(2*an-2);
			if(an>=2000){
				System.out.println("el primer numero que cumple con la condicion es:  "+n+"  "+(n-1));
				break;
			}
			n++;
		}

	}

}
