public class MyArraySizeException extends Exception {


    private int number;

    public int getNumber() {
        return number;
    }

    public MyArraySizeException(String message) {

        super(message);
    }


}
