package Lesson6_ClientServer.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server
{

  public static void main(String[] args)
  {
    try
    {
      int port = 6666;
      ServerSocket serverSocket = new ServerSocket(port);

      System.out.println("************************");
      System.out.println("I am waiting a client");
      System.out.println("************************");


      Socket clientSocket = serverSocket.accept();
      System.out.println("************************");
      System.out.println("I got new client");
      System.out.println("************************");

      InputStream is = clientSocket.getInputStream();
      OutputStream os = clientSocket.getOutputStream();

      DataInputStream dataInputStream = new DataInputStream(is);
      DataOutputStream dataOutputStream = new DataOutputStream(os);

      String line = null;
      while (true)
      {
        System.out.println("I am waiting info from client...");
        line = dataInputStream.readUTF();

        if (line.equalsIgnoreCase("EXIT"))
        {
          System.out.println("Client want to exit");
          break;
        }

        System.out.println("Client send a message with text = " + line);

        dataOutputStream.writeUTF("I received your message. Your message = " + line);
        dataOutputStream.flush();

      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }


  }
}
