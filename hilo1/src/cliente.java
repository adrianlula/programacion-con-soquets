

import java.io.*; 
import java.net.Socket;
import java.util.*;
import java.util.logging.*; 
class Persona extends Thread {
	protected Socket sk;
	protected DataOutputStream dos;
	protected DataInputStream dis;
	private int id;
	public Persona(int id) {
		this.id = id;
		}
	@Override
	public void run() { 
		try { sk = new Socket("localhost",  6789);
		dos = new DataOutputStream(sk.getOutputStream()); 
		dis = new DataInputStream(sk.getInputStream());
		Scanner escan = new Scanner(System.in);
		String mensaje;
		System.out.println(id + " envía algo al cervidor");
		mensaje=escan.nextLine();
		
		
		dos.writeUTF(mensaje); 
		String respuesta=""; 
		respuesta = dis.readUTF(); 
		System.out.println(id + " el servidor responde: " + respuesta);
		dis.close(); 
		dos.close();
		sk.close(); 
		} catch (IOException ex) {
 Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
 } 
		}
	}
public class cliente {
	public static void main(String[] args) { 
		ArrayList<Thread> clients = new ArrayList<Thread>();
		for (int i = 0; i < 5; i++) {
			clients.add(new Persona(i));
			}
		for (Thread thread : clients) {
			thread.start();
			}
		}
	}
