package redes;

import java.util.Scanner;

public class tramasexa {

	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		String trama;
		trama=escan.nextLine();
		String caso;
		
		int casi;
		
		
		caso=trama.substring(0,6);
		casi=exa(caso);
		
		System.out.print("dirección mac origen global: "+casi);
		caso=trama.substring(6,12);
		casi=exa(caso);
		System.out.println("dirección mac origen de empresa: "+casi);
		caso=trama.substring(12,18);
		casi=exa(caso);
		System.out.print("dirección mac destino global: "+casi);
		caso=trama.substring(18,24);
		casi=exa(caso);
		System.out.println("dirección mac destino empresa: "+casi);
		caso=trama.substring(24,28);
		casi=exa(caso);
		System.out.println("Tipo de servicio Ethertype "+casi);
		
		if(caso.equals("ae")){   /*   si es para el protocolo ip */
			caso=trama.substring(28,29);
			casi=exa(caso);
			System.out.println(" versión:"+casi);
			caso=trama.substring(29,30);
			casi=exa(caso);
			System.out.println("Tamaño cabecera "+casi);
			caso=trama.substring(30,32);
			casi=exa(caso);
			System.out.println("Tipo de Servicio "+casi);
			caso=trama.substring(32,36);
			casi=exa(caso);
			System.out.println("Longitud Total "+casi);
			caso=trama.substring(36,40);
			casi=exa(caso);
			System.out.println("Identificador "+casi);
			caso=trama.substring(40,41);
			casi=exa(caso);
			System.out.println("fag1 "+casi);
			caso=trama.substring(41,42);
			casi=exa(caso);
			System.out.println("falg2: "+casi);
			caso=trama.substring(42,43);
			casi=exa(caso);
			System.out.println("falg3: "+casi);
			caso=trama.substring(43,47);
			casi=exa(caso);
			System.out.println("Posición de Fragmento: "+casi);
			caso=trama.substring(47,49);
			casi=exa(caso);
			System.out.println("Tiempo de Vida (TTL): "+casi);
			caso=trama.substring(49,53);
String protocolo=caso;
casi=exa(caso);
			System.out.println("protocolo: "+casi);
			caso=trama.substring(53,57);
			casi=exa(caso);
			System.out.println("Suma de Control de Cabecera (checksum): "+casi);
			caso=trama.substring(57,65);
			casi=exa(caso);
			System.out.println("Dirección IP de origen): "+casi);
			caso=trama.substring(57,61);
			casi=exa(caso);
			System.out.print("red IP de origen): "+casi);
			caso=trama.substring(61,65);
			casi=exa(caso);
			System.out.println("host IP de origen): "+casi);
			caso=trama.substring(65,73);
			casi=exa(caso);
			System.out.println("Dirección IP de destino): "+casi);
			
			caso=trama.substring(65,69);
			casi=exa(caso);
			System.out.print("red IP de destino): "+casi);
			caso=trama.substring(69,73);
			casi=exa(caso);
			System.out.println("host IP de destino): "+casi);
			caso=trama.substring(73,77);
			casi=exa(caso);
			System.out.println("opciones y relleno: "+casi);
			   if(protocolo.equals("ab23")){      /*   si es TCP  */
				    caso=trama.substring(77,81);
				    casi=exa(caso);
					System.out.println("puerto origen: "+casi);
					caso=trama.substring(81,85);
					casi=exa(caso);
					System.out.println("puerto destino: "+casi);
					caso=trama.substring(85,93);
					casi=exa(caso);
					System.out.println("numero de secuencia: "+casi);
					caso=trama.substring(93,101);
					casi=exa(caso);
					System.out.println("numero de acuse: "+casi);
					caso=trama.substring(101,102);
					casi=exa(caso);
					System.out.println("longuitud de cabecera: "+casi);
					caso=trama.substring(102,104);
					casi=exa(caso);
					System.out.println("bits recervados: "+casi);
					caso=trama.substring(104,105);
					casi=exa(caso);
					System.out.println("URG: "+casi);
					caso=trama.substring(105,106);
					casi=exa(caso);
					System.out.println("ACK: "+casi);
					caso=trama.substring(106,107);
					casi=exa(caso);
					System.out.println("PSH: "+casi);
					caso=trama.substring(107,108);
					casi=exa(caso);
					System.out.println("RST: "+casi);
					caso=trama.substring(108,109);
					casi=exa(caso);
					System.out.println("SYN: "+casi);
					caso=trama.substring(109,110);
					casi=exa(caso);
					System.out.println("FIN: "+casi);
					caso=trama.substring(110,114);
					casi=exa(caso);
					System.out.println("tamaño de ventana: "+casi);
					caso=trama.substring(114,118);
					casi=exa(caso);
					System.out.println("checksum: "+casi);
					caso=trama.substring(118,122);
					casi=exa(caso);
					System.out.println("puntero urgente: "+casi);
					caso=trama.substring(122,126);
					System.out.println("opciones mas relleno: "+casi);
					caso=trama.substring(126,trama.length());
					System.out.println("datos de aplicasion: "+casi);
			   }
			   if(protocolo.equals("11001100")){      /*   si es UDP  */
				   caso=trama.substring(77,81);
				   casi=exa(caso);
					System.out.println("puerto origen: "+casi);
					caso=trama.substring(81,85);
					casi=exa(caso);
					System.out.println("puerto destino: "+casi);
					caso=trama.substring(85,89);
					casi=exa(caso);
					System.out.println("longuitud del UDP: "+casi);
					caso=trama.substring(89,93);
					casi=exa(caso);
					System.out.println("checksum: "+casi);
					caso=trama.substring(93,trama.length());
					casi=exa(caso);
					System.out.println("datos de aplicasion: "+casi);
			   }
		}
		

	}

	private static int exa(String caso) {
		int contador=0;
		int contador2=0;
		int cantador3=0;
		char  caido;
		for(int i=caso.length()-1;i>-1;i--){
			contador2=16^cantador3;
			caido=caso.charAt(cantador3);
			switch(caido){ 
			case '0': 
				break;
			case '1':
				contador=contador+1*cantador3;
				break;
			case '2':
				contador=contador+2*cantador3;
				break;
			case '3':
				contador=contador+3*cantador3;
				break;
			case '4':
				contador=contador+4*cantador3;
				break;
			case '5':
				contador=contador+5*cantador3;
				break;
			case '6':
				contador=contador+6*cantador3;
				break;
			case '7':
				contador=contador+7*cantador3;
				break;
			case '8':
				contador=contador+8*cantador3;
				break;
			case '9':
				contador=contador+9*cantador3;
				break;
			case 'a':
				contador=contador+10*cantador3;
				break;
			case 'b':
				contador=contador+11*cantador3;
				break;
			case 'c':
				contador=contador+12*cantador3;
				break;
			case 'd':
				contador=contador+13*cantador3;
				break;
			case 'e':
				contador=contador+14*cantador3;
			break;
			
			
			}
			
		cantador3++;
		}
		
		return contador;
	}

}
