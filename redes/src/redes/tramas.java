package redes;

import java.util.Scanner;

public class tramas {

	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		String trama;
		trama=escan.nextLine();
		String caso;
		
		int casi;
		
		caso=trama.substring(0,24);
		casi=bin(caso);
		System.out.print("dirección mac origen global: "+casi);
		caso=trama.substring(24,48);
		casi=bin(caso);
		System.out.println("dirección mac origen de empresa: "+casi);
		caso=trama.substring(48,72);
		casi=bin(caso);
		System.out.print("dirección mac destino global: "+casi);
		caso=trama.substring(72,96);
		casi=bin(caso);
		System.out.println("dirección mac destino empresa: "+casi);
		caso=trama.substring(96,112);
		casi=bin(caso);
		System.out.println("Tipo de servicio Ethertype "+casi);
		
		if(casi==8){   /*   si es para el protocolo ip */
			caso=trama.substring(112,116);
			casi=bin(caso);
			System.out.println(" versión:"+caso);
			caso=trama.substring(116,120);
			casi=bin(caso);
			System.out.println("Tamaño cabecera "+casi);
			caso=trama.substring(120,128);
			casi=bin(caso);
			System.out.println("Tipo de Servicio "+casi);
			caso=trama.substring(120,136);
			casi=bin(caso);
			System.out.println("Longitud Total "+casi);
			caso=trama.substring(136,152);
			casi=bin(caso);
			System.out.println("Identificador "+casi);
			caso=trama.substring(152,153);
			casi=bin(caso);
			System.out.println("fag1 "+casi);
			caso=trama.substring(153,154);
			casi=bin(caso);
			System.out.println("falg2: "+casi);
			caso=trama.substring(154,155);
			casi=bin(caso);
			System.out.println("falg3: "+casi);
			caso=trama.substring(155,168);
			casi=bin(caso);
			System.out.println("Posición de Fragmento: "+casi);
			caso=trama.substring(168,176);
			casi=bin(caso);
			System.out.println("Tiempo de Vida (TTL): "+casi);
			caso=trama.substring(176,192);
			casi=bin(caso);
String protocolo=caso;
			System.out.println("protocolo: "+casi);
			caso=trama.substring(192,208);
			casi=bin(caso);
			System.out.println("Suma de Control de Cabecera (checksum): "+casi);
			caso=trama.substring(208,240);
			casi=bin(caso);
			System.out.println("Dirección IP de origen): "+casi);
			caso=trama.substring(208,224);
			casi=bin(caso);
			System.out.print("red IP de origen): "+casi);
			caso=trama.substring(224,240);
			casi=bin(caso);
			System.out.println("host IP de origen): "+casi);
			caso=trama.substring(240,272);
			casi=bin(caso);
			System.out.println("Dirección IP de destino): "+casi);
			
			caso=trama.substring(240,256);
			casi=bin(caso);
			System.out.print("red IP de destino): "+casi);
			caso=trama.substring(256,272);
			casi=bin(caso);
			System.out.println("host IP de destino): "+casi);
			caso=trama.substring(272,304);
			casi=bin(caso);
			System.out.println("opciones y relleno: "+casi);
			   if(protocolo.equals("11001101")){      /*   si es TCP  */
				   caso=trama.substring(304,320);
				   casi=bin(caso);
					System.out.println("puerto origen: "+casi);
					caso=trama.substring(320,336);
					casi=bin(caso);
					System.out.println("puerto destino: "+casi);
					caso=trama.substring(336,368);
					casi=bin(caso);
					System.out.println("numero de secuencia: "+casi);
					caso=trama.substring(368,400);
					casi=bin(caso);
					System.out.println("numero de acuse: "+casi);
					caso=trama.substring(400,404);
					casi=bin(caso);
					System.out.println("longuitud de cabecera: "+casi);
					caso=trama.substring(404,410);
					casi=bin(caso);
					System.out.println("bits recervados: "+casi);
					caso=trama.substring(410,411);
					casi=bin(caso);
					System.out.println("URG: "+casi);
					caso=trama.substring(411,412);
					casi=bin(caso);
					System.out.println("ACK: "+casi);
					caso=trama.substring(412,413);
					casi=bin(caso);
					System.out.println("PSH: "+casi);
					caso=trama.substring(413,414);
					casi=bin(caso);
					System.out.println("RST: "+casi);
					caso=trama.substring(414,415);
					casi=bin(caso);
					System.out.println("SYN: "+casi);
					caso=trama.substring(415,416);
					casi=bin(caso);
					System.out.println("FIN: "+casi);
					caso=trama.substring(416,432);
					casi=bin(caso);
					System.out.println("tamaño de ventana: "+casi);
					caso=trama.substring(432,448);
					casi=bin(caso);
					System.out.println("checksum: "+casi);
					caso=trama.substring(448,464);
					casi=bin(caso);
					System.out.println("puntero urgente: "+casi);
					caso=trama.substring(464,496);
					casi=bin(caso);
					System.out.println("opciones mas relleno: "+casi);
					caso=trama.substring(496,trama.length());
					casi=bin(caso);
					System.out.println("datos de aplicasion: "+casi);
			   }
			   if(protocolo.equals("11001100")){      /*   si es UDP  */
				   caso=trama.substring(304,320);
				   casi=bin(caso);
					System.out.println("puerto origen: "+casi);
					caso=trama.substring(320,336);
					casi=bin(caso);
					System.out.println("puerto destino: "+casi);
					caso=trama.substring(336,352);
					casi=bin(caso);
					System.out.println("longuitud del UDP: "+casi);
					caso=trama.substring(352,368);
					casi=bin(caso);
					System.out.println("checksum: "+casi);
					caso=trama.substring(368,trama.length());
					casi=bin(caso);
					System.out.println("datos de aplicasion: "+casi);
			   }
		}
		

	}

	private static int bin(String caso) {
		int contador=0;
		int contador2=0;
		int cantador3=0;
		for(int i=caso.length()-1;i>-1;i--){
			cantador3++;
			contador2=2^cantador3;
		if(caso.charAt(i)=='1'){
			contador=contador+contador2;
		}
		}
		
		return contador;
	}

}
