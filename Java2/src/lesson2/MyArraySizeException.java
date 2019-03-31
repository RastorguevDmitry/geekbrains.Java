package lesson2;

public class MyArraySizeException extends Exception {

    String message;
    private int number;

    public int getNumber() {
        return number;
    }

    public MyArraySizeException(String message) {
        this.message = message;
    }


}
