package Lesson7ClientServer.Server;

public interface AuthService  {
    void start();
    String getNickByLoginPass(String login, String pass);
    void stop();
}

