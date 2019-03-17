public class Main {
//    1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
//    при подаче массива другого размера необходимо бросить исключение MyArraySizeException.

//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или
// текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой
// именно ячейке лежат неверные данные.

// 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException
// и MyArrayDataException, и вывести результат расчета.


   public   final static int RAZMERNOST = 4; //текущая размерность массива
   public   final static int RAZMERNOST_FOR_CHEK = 4; //проверяемая размерность

    public static void main(String[] args) throws MyArraySizeException {
        String[][] massiv = new String[RAZMERNOST][RAZMERNOST];
        String[][] massivNew = new String[5][5];

        //создание массива
        for (int i = 0; i < RAZMERNOST; i++) {
            for (int j = 0; j < RAZMERNOST; j++) {
                massiv[i][j] = " " + i + j;
            }
        }


        MassivaStringVInt newMassiv= new MassivaStringVInt(massiv);
        newMassiv.massivaStringVInt();

    }





}