class MassivaStringVInt {
    String[][] massiv;


    public MassivaStringVInt(String[][] massiv) {
        this.massiv = massiv;
    }


    public void massivaStringVInt() throws MyArraySizeException {
        String[][] newMassivInt = new String[Main.RAZMERNOST][Main.RAZMERNOST];


        //проверка размерности
        int a;
        for (String[] m : massiv) {
            if (m.length != Main.RAZMERNOST_FOR_CHEK) throw new MyArraySizeException("MyArraySizeException");
        }
        if (massiv.length != Main.RAZMERNOST_FOR_CHEK) throw new MyArraySizeException("MyArraySizeException");

        for (int i = 0; i < Main.RAZMERNOST_FOR_CHEK; i++) {
            for (int j = 0; j < Main.RAZMERNOST_FOR_CHEK; j++) {
                System.out.print(massiv[i][j]);
            }
            System.out.println();
        }
    }


}
