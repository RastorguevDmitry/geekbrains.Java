package lesson2;

public class MyArrayDataException extends NumberFormatException {

    int i, j;
    String message;


    public MyArrayDataException(String message, int i, int j) {
        this.message = message;
        this.i = i;
        this.j = j;
    }


}
