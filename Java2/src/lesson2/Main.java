package lesson2;

public class Main {
//    1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
//    при подаче массива другого размера необходимо бросить исключение MyArraySizeException.

//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или
// текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой
// именно ячейке лежат неверные данные.

// 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException
// и MyArrayDataException, и вывести результат расчета.


    final static int RAZMERNOST = 5;

    public static void main(String[] args) {
        String[][] massiv = new String[RAZMERNOST][RAZMERNOST];
        String[][] massivNew = new String[5][5];

        //создание массива
        for (int i = 0; i < RAZMERNOST; i++) {
            for (int j = 0; j < RAZMERNOST; j++) {
                massiv[i][j] = " " + i + j;
            }
        }



        massivaStringVInt(massiv);


    }

    private static void massivaStringVInt(String[][] massiv) {
        String[][] newMassivInt = new String[RAZMERNOST][RAZMERNOST];


        //проверка размерности
        int a;
        for (String[] m : massiv) {
            if (m.length !=RAZMERNOST)  a = 0;
        }


        for (int i = 0; i < RAZMERNOST; i++) {
            for (int j = 0; j < RAZMERNOST; j++) {
                System.out.print(massiv[i][j]);
            }
            System.out.println();
        }


    }



}
