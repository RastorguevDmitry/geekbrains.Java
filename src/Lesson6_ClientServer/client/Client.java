package Lesson6_ClientServer.client;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


public class Client
{

  public static void main(String[] args)
  {
    int serverPort = 6666;

    try
    {
      InetAddress ipAddress = InetAddress.getLocalHost();
      System.out.println("************************");
      System.out.println("I am new client");
      System.out.println("I will connect with server");
      System.out.println("************************");

      Socket socket = new Socket(ipAddress, serverPort);

      System.out.println("************************");
      System.out.println("We have a connection");
      System.out.println("************************");


      InputStream is = socket.getInputStream();
      OutputStream os = socket.getOutputStream();

      DataInputStream dataInputStream = new DataInputStream(is);
      DataOutputStream dataOutputStream = new DataOutputStream(os);

      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

      while (true)
      {
        String msg = keyboard.readLine();
        System.out.println("We are sending to server message = " + msg);
        dataOutputStream.writeUTF(msg);
        dataOutputStream.flush();

        String responseFromServer = dataInputStream.readUTF();

        if (msg.equalsIgnoreCase("EXIT"))
        {
          System.out.println("I want to exit");
          break;
        }

        System.out.println("************************");
        System.out.println("We received response from server ==============>>>>>>> " + responseFromServer);
        System.out.println("************************");

      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }

  }
}
