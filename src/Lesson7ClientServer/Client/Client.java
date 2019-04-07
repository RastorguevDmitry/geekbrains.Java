package Lesson7ClientServer.Client;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


public class Client
{

  public static void main(String[] args)
  {

    try {
      Socket socket = new Socket("localhost", 8189);
      DataInputStream in = new DataInputStream(socket.getInputStream());
      DataOutputStream out = new DataOutputStream(socket.getOutputStream());

    //  setAuthorized(false);
      Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
          try {
            while (true) {
              String strFromServer = in.readUTF();
              if(strFromServer.startsWith("/authok")) {
    //            setAuthorized(true);
                break;
              }
              chatArea.appendText(strFromServer + "\n");
            }
            while (true) {
              String strFromServer = in.readUTF();
              if (strFromServer.equalsIgnoreCase("/end")) {
                break;
              }
              chatArea.append(strFromServer);
              chatArea.append("\n");
            }
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      });
      t.setDaemon(true);
      t.start();
    } catch (IOException e) {
      e.printStackTrace();
    }


  }


  public void onAuthClick() {
    try {
      out.writeUTF("/auth " + loginField.getText() + " " + passField.getText());
      loginField.clear();
      passField.clear();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


}
