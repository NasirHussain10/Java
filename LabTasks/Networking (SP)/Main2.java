package clinet;
import java.io.*;
import java.net.*;

public class Main2 {

	public static void main(String[] args) {
		try 
		{
		Socket socket = new Socket("localhost", 5000);  // connect to server

        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        output.writeUTF("Hello Server!");
      //  output.writeUTF("Hello again");  // second message
        
        output.close();
        socket.close();
		}
		catch(Exception ex)
		{
			 System.out.println("Error: " + ex.getMessage());
		}
	}

}