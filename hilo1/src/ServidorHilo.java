

import java.io.*;
import java.net.*;
import java.util.logging.*;
public class ServidorHilo extends Thread {
	private Socket socket;
	private DataOutputStream dos;
	private DataInputStream dis;
	private int idSessio;
	public ServidorHilo(Socket socket, int id) {
		this.socket = socket;
		this.idSessio = id; 
		try { dos = new DataOutputStream(socket.getOutputStream());
		dis = new DataInputStream(socket.getInputStream());
		} catch (IOException ex) {
			Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex); 
			}
		}
	public void desconnectar() 
	{
		try { socket.close();
		} catch (IOException ex) {
			Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	@Override 
	public void run() { 
		String accion = "";
		String accionmay;
		try { 
			accion = dis.readUTF();
		
			accionmay=accion.toUpperCase();
			System.out.println("El cliente con idSesion "+this.idSessio+"dice"+accion);
			dos.writeUTF(accionmay);
			
		} catch (IOException ex) { 
			Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
			}
		desconnectar();
		}
	
	}


