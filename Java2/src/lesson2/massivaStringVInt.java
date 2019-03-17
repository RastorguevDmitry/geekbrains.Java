package lesson2;

class MassivaStringVInt {
    String[][] massiv;


    public MassivaStringVInt(String[][] massiv) {
        this.massiv = massiv;
    }


    public void masStringVInt() throws MyArraySizeException, MyArrayDataException {
        String[][] newMassivInt = new String[Main.RAZMERNOST][Main.RAZMERNOST];

        //проверка размерности
        int summa = 0;
        int elMassivaToInt = 0;
        for (String[] m : massiv) {
            if (m.length != Main.RAZMERNOST_FOR_CHEK)
                throw new MyArraySizeException("Ширина заданного массива отличается от 4");
        }
        if (massiv.length != Main.RAZMERNOST_FOR_CHEK)
            throw new MyArraySizeException("Глубина заданного массива отличается от 4");

        // преобразование String в Int
        for (int i = 0; i < Main.RAZMERNOST_FOR_CHEK; i++) {
            for (int j = 0; j < Main.RAZMERNOST_FOR_CHEK; j++) {
                try {
                    elMassivaToInt = Integer.parseInt(massiv[i][j]);
                } catch (NumberFormatException myArray) {
                    System.out.println(summa);
                    throw new MyArrayDataException("Ошибка преобразования массива в число. ", i, j);
                }
                summa += elMassivaToInt;
                //  System.out.print(massiv[i][j] + " ");
            }

        }
        System.out.println("Сумма элементов массива = " + summa);
    }

}
