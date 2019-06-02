package Lesson7ClientServer.Client;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


public class Client {

    Socket socket;
    DataInputStream in;
    DataOutputStream out;
    boolean authorized;
    String myNick;

    public  void main(String[] args) {
        start();

    }


    public  void start() {
        try {
            setAuthorized(false);
            socket = new Socket("localhost", 8189);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            Thread t = new Thread(() -> {

                try {
                    while (true) {
                        String str = in.readUTF();
                        if (str.startsWith("/authok ")) {
                            setAuthorized(true);
                            myNick = str.split("\\s")[1];
                            break;
                        }
//                        textArea.appendText(str + "\n");
                    }
                    // ...
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        setAuthorized(false);
                        socket.close();
                        myNick = "";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.start();
        } catch (IOException e) {
//            showAlert("Не удалось подключиться к серверу");
            e.printStackTrace();
        }
    }

    private void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public void onAuthClick() {
        if (socket == null || socket.isClosed()) {
            start();
        }
        try {
//            out.writeUTF("/auth " + loginField.getText() + " " + passField.getText());
//            loginField.setText("");
//            passField.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
