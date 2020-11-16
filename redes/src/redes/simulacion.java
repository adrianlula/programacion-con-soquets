package redes;


import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class simulacion {
	public static void main(String[] args) throws IOException {
		 String cadena;
		 int contador=0;
	        FileReader f = new FileReader("hola.txt");
	        BufferedReader b = new BufferedReader(f);
	        while((cadena = b.readLine())!=null) {
	            System.out.println(cadena);
	            contador++;
	            
	        }
	        System.out.println(cadena);
	        b.close();
		File archivo = new File ("hola.txt");
		FileReader fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);
		int cambio;
	
		String linea = br.readLine();
		
				System.out.println("se carga el archivo y contiene");
		System.out.println(linea);
		String valoresB[]= new String[linea.length()];
		for(int i=0;i<linea.length();i++){
			valoresB[i] = String.format("%8s", Integer.toBinaryString(linea.charAt(i)));
			System.out.println("cadChar: "+linea.charAt(i));
			System.out.println(valoresB[i]);
		}
		String apollo[]= new String[linea.length()];
		
		System.out.println("se envian las cadenas sin tecnica");
		for(int i=0;i<linea.length();i++){
			System.out.println(valoresB[i]);
			apollo[i]=valoresB[i];
		}
		Random ran=new Random();
		cambio=ran.nextInt(6);
		
		System.out.println("se cambia el bit "+(cambio+1));
		System.out.println("de la primera trama");
		String ayuda;
		String antes;
		String despues;
		String cero="0";
		switch(cambio){
		case 0:
			 antes=valoresB[0].substring(0,1);
			 despues=valoresB[0].substring(2,8);
			
			ayuda=valoresB[0].substring(1,2);
			System.out.println(ayuda);
			if(ayuda.equalsIgnoreCase(cero)){
				System.out.println("es un cero");
				apollo[0]=antes+1+despues;
			}else{
				System.out.println("es un uno");
				apollo[0]=antes+0+despues;
			}
			break;
case 1:
	 antes=valoresB[0].substring(0,2);
	 despues=valoresB[0].substring(3,8);
	
	ayuda=valoresB[0].substring(2,3);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
			break;
case 2:
	 antes=valoresB[0].substring(0,3);
	 despues=valoresB[0].substring(4,8);
	
	ayuda=valoresB[0].substring(3,4);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	
	break;
case 3:
	 antes=valoresB[0].substring(0,4);
	 despues=valoresB[0].substring(5,8);
	
	ayuda=valoresB[0].substring(4,5);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
case 4:
	 antes=valoresB[0].substring(0,5);
	 despues=valoresB[0].substring(6,8);
	
	ayuda=valoresB[0].substring(5,6);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
case 5:
	 antes=valoresB[0].substring(0,6);
	 despues=valoresB[0].substring(7,8);
	
	ayuda=valoresB[0].substring(6,7);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
case 6:
	 antes=valoresB[0].substring(0,7);
	 despues=valoresB[0].substring(8,8);
	
	ayuda=valoresB[0].substring(7,8);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
		}
		System.out.println("se reciven las cadenas sin tecnica");
		System.out.println("simulacion error simple");
		for(int i=0;i<linea.length();i++){
			System.out.println(apollo[i]);
		}
		System.out.println("no se detecta error");
		cambio=ran.nextInt(6);
		System.out.println("se cambia el bit "+(cambio+1));
		System.out.println("de la primera trama");
		switch(cambio){
		case 0:
			 antes=apollo[0].substring(0,1);
			 despues=apollo[0].substring(2,8);
			
			ayuda=apollo[0].substring(1,2);
			System.out.println(ayuda);
			if(ayuda.equalsIgnoreCase(cero)){
				System.out.println("es un cero");
				apollo[0]=antes+1+despues;
			}else{
				System.out.println("es un uno");
				apollo[0]=antes+0+despues;
			}
			break;
case 1:
	 antes=apollo[0].substring(0,2);
	 despues=apollo[0].substring(3,8);
	
	ayuda=apollo[0].substring(2,3);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
			break;
case 2:
	 antes=apollo[0].substring(0,3);
	 despues=apollo[0].substring(4,8);
	
	ayuda=valoresB[0].substring(3,4);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	
	break;
case 3:
	 antes=apollo[0].substring(0,4);
	 despues=apollo[0].substring(5,8);
	
	ayuda=valoresB[0].substring(4,5);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
case 4:
	 antes=apollo[0].substring(0,5);
	 despues=apollo[0].substring(6,8);
	
	ayuda=valoresB[0].substring(5,6);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
case 5:
	 antes=apollo[0].substring(0,6);
	 despues=apollo[0].substring(7,8);
	
	ayuda=valoresB[0].substring(6,7);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
case 6:
	 antes=apollo[0].substring(0,7);
	 despues=apollo[0].substring(8,8);
	
	ayuda=apollo[0].substring(7,8);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
		}
		System.out.println("se reciven las cadenas sin tecnica");
		System.out.println("simulacion error de rafaga");
		for(int i=0;i<linea.length();i++){
			System.out.println(apollo[i]);
		}
		System.out.println("no se detecta error");
		int arreglo[];
		arreglo=new int[linea.length()];
		for(int i=0;i<linea.length();i++){
			arreglo[i]=0;
		}
		
		
		for(int j=0;j<linea.length();j++){
		for(int i=0;i<7;i++){
			ayuda=valoresB[j].substring((1+i),(2+i));
			if(ayuda.equalsIgnoreCase(cero)){
				arreglo[j]++;
			}
		}
		}
		System.out.println("se envian las tramas en paridad simple");
		
		for(int i=0;i<linea.length();i++){
			
		 if((arreglo[i]%2)==0){
			 apollo[i]=valoresB[i]+1;
			 System.out.println(apollo[i]);
		 }
		 else{
			 apollo[i]=valoresB[i]+0;
			 System.out.println(apollo[i]);
		 }
		}
cambio=ran.nextInt(6);
		
		System.out.println("se cambia el bit "+(cambio+1));
		System.out.println("de la primera trama simulasion simple");
		
		switch(cambio){
		case 0:
			 antes=apollo[0].substring(0,1);
			 despues=apollo[0].substring(2,9);
			
			ayuda=apollo[0].substring(1,2);
			System.out.println(ayuda);
			if(ayuda.equalsIgnoreCase(cero)){
				System.out.println("es un cero");
				apollo[0]=antes+1+despues;
			}else{
				System.out.println("es un uno");
				apollo[0]=antes+0+despues;
			}
			
			break;
case 1:
	 antes=apollo[0].substring(0,2);
	 despues=apollo[0].substring(3,9);
	
	ayuda=apollo[0].substring(2,3);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
			break;
case 2:
	 antes=apollo[0].substring(0,3);
	 despues=apollo[0].substring(4,9);
	
	ayuda=apollo[0].substring(3,4);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	
	break;
case 3:
	 antes=apollo[0].substring(0,4);
	 despues=apollo[0].substring(5,9);
	
	ayuda=apollo[0].substring(4,5);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
case 4:
	 antes=apollo[0].substring(0,5);
	 despues=apollo[0].substring(6,9);
	
	ayuda=apollo[0].substring(5,6);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
case 5:
	 antes=apollo[0].substring(0,6);
	 despues=apollo[0].substring(7,9);
	
	ayuda=apollo[0].substring(6,7);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
case 6:
	 antes=apollo[0].substring(0,7);
	 despues=apollo[0].substring(8,9);
	
	ayuda=apollo[0].substring(7,8);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
		
	}
		System.out.println("se reciben las tramas");
		for(int i=0;i<linea.length();i++){
			System.out.println(apollo[i]);
			 
			}
		for(int i=0;i<linea.length();i++){
			arreglo[i]=0;
		}
		for(int j=0;j<linea.length();j++){
			for(int i=0;i<7;i++){
				ayuda=apollo[j].substring((1+i),(2+i));
				if(ayuda.equalsIgnoreCase(cero)){
					arreglo[j]++;
				}
			}
			}
		int error=0;

		for(int i=0;i<linea.length();i++){
			if((arreglo[i]%2)==0){
				ayuda=apollo[i].substring(8,9);
				if(ayuda.equalsIgnoreCase(cero)){
					error++;
				}else{
					
				}
			}else{
				ayuda=apollo[i].substring(8,9);
                if(ayuda.equalsIgnoreCase(cero)){
                	
				}else{
					error++;
				}
				
			}
		}
		System.out.println("se detectaron "+error+" errores");
cambio=ran.nextInt(6);
		
		System.out.println("se cambia el bit "+(cambio+1));
		System.out.println("de la primera trama simulasion de rafaga");
		
		switch(cambio){
		case 0:
			 antes=apollo[0].substring(0,1);
			 despues=apollo[0].substring(2,9);
			
			ayuda=apollo[0].substring(1,2);
			System.out.println(ayuda);
			if(ayuda.equalsIgnoreCase(cero)){
				System.out.println("es un cero");
				apollo[0]=antes+1+despues;
			}else{
				System.out.println("es un uno");
				apollo[0]=antes+0+despues;
			}
			
			break;
case 1:
	 antes=apollo[0].substring(0,2);
	 despues=apollo[0].substring(3,9);
	
	ayuda=apollo[0].substring(2,3);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
			break;
case 2:
	 antes=apollo[0].substring(0,3);
	 despues=apollo[0].substring(4,9);
	
	ayuda=apollo[0].substring(3,4);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	
	break;
case 3:
	 antes=apollo[0].substring(0,4);
	 despues=apollo[0].substring(5,9);
	
	ayuda=apollo[0].substring(4,5);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
case 4:
	 antes=apollo[0].substring(0,5);
	 despues=apollo[0].substring(6,9);
	
	ayuda=apollo[0].substring(5,6);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
case 5:
	 antes=apollo[0].substring(0,6);
	 despues=apollo[0].substring(7,9);
	
	ayuda=apollo[0].substring(6,7);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
case 6:
	 antes=apollo[0].substring(0,7);
	 despues=apollo[0].substring(8,9);
	
	ayuda=apollo[0].substring(7,8);
	System.out.println(ayuda);
	if(ayuda.equalsIgnoreCase(cero)){
		System.out.println("es un cero");
		apollo[0]=antes+1+despues;
	}else{
		System.out.println("es un uno");
		apollo[0]=antes+0+despues;
	}
	break;
		
	}
		System.out.println("se reciben las tramas");
		for(int i=0;i<linea.length();i++){
			System.out.println(apollo[i]);
			 
			}
		for(int i=0;i<linea.length();i++){
			arreglo[i]=0;
		}
		for(int j=0;j<linea.length();j++){
			for(int i=0;i<7;i++){
				ayuda=apollo[j].substring((1+i),(2+i));
				if(ayuda.equalsIgnoreCase(cero)){
					arreglo[j]++;
				}
			}
			}
		error=0;

		for(int i=0;i<linea.length();i++){
			if((arreglo[i]%2)==0){
				ayuda=apollo[i].substring(8,9);
				if(ayuda.equalsIgnoreCase(cero)){
					error++;
				}else{
					
				}
			}else{
				ayuda=apollo[i].substring(8,9);
                if(ayuda.equalsIgnoreCase(cero)){
                	
				}else{
					error++;
				}
				
			}
		}
		
		System.out.println("se detectaron "+error+" errores");
		String primeros,medios,fin;
		for(int i=0;i<linea.length();i++){
			primeros=valoresB[i].substring(0, 4);
			medios=valoresB[i].substring(4, 7);
			fin=valoresB[i].substring(7, 8);
			String paridad1;	
			String paridad2;
			String paridad3;
			String paridad4;
			
		}
		
}
}
