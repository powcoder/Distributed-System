https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder

import java.net.*;
import java.io.*;
public class UDPClient1{
    public static void main(String args[]){ 
		
		//The first argument is the message to send to the server. 
		//The second argument is the name of the server.
		
		DatagramSocket aSocket = null;
		try {
			
			//Create a UDP socket
			aSocket = new DatagramSocket();
			
			//Prepare the message to send to the server
			byte [] m = args[0].getBytes();
			InetAddress aHost = InetAddress.getByName(args[1]);
			
			//Agreed port
			int serverPort = 6789;		                                                 
			
			//Create a UDP datagram
			DatagramPacket request =
			 	new DatagramPacket(m,  args[0].length(), aHost, serverPort);
			
			//Send the request
			aSocket.send(request);
			
			//Prepare a buffer to receive the reply from the server
			byte[] buffer = new byte[1000];
			
			//Waiting for reply
			DatagramPacket reply = new DatagramPacket(buffer, buffer.length);	
			aSocket.receive(reply);
			
			//Display the reply
			String response=new String(reply.getData(), 0, reply.getLength());
			System.out.print("Server Response: "+response);
			
		}catch (SocketException e){System.out.println("Socket: " + e.getMessage());
		}catch (IOException e){System.out.println("IO: " + e.getMessage());
		}finally {if(aSocket != null) aSocket.close();}
	}		      	
}
