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

    public final static int RAZMERNOST = 4; //текущая размерность массива
    public final static int RAZMERNOST_FOR_CHEK = 4; //проверяемая размерность

    public static void main(String[] args) {
        String[][] massiv = new String[RAZMERNOST][5];

        //заполнение строкового массива 4*4
        for (int i = 0; i < RAZMERNOST; i++) {
            for (int j = 0; j < RAZMERNOST; j++) {
                massiv[i][j] = "" + i + j;
            }
            // тест - ввести строку в яцейку
            massiv[2][3] = "d";
        }

        MassivaStringVInt newMassiv = new MassivaStringVInt(massiv);

        try {
            newMassiv.masStringVInt();
        }
        //ошибки при невозможности преобразования в число введенного массива
        catch (MyArrayDataException myArrayDataException) {
            System.out.println(myArrayDataException.message + "Ошибка в ячейке [" +
                    myArrayDataException.i + "], [" + myArrayDataException.j + "]");
        }
        //ошибки при введении массива, размерностью отличной от 4*4
        catch (MyArraySizeException myArraySizeException) {
            System.out.println(myArraySizeException.message);
        }
    }

}