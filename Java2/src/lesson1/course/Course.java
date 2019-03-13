package lesson1.course;

//Добавить класс Course (полоса препятствий), в котором будут находиться:
// массив препятствий, метод который будет просить команду пройти всю полосу;

import lesson1.team.Team;

import java.util.Arrays;

public class Course {


    //массив препятствий
    private String[] massivPrepyatstviy;
    private int[] dlinnaPrepyatstviy;

    public Course(String... prepyatstviya) {
        this.massivPrepyatstviy = prepyatstviya;
    }

    public Course(String[] prepyatstviya, int[] dlinnaPrepyatstviy) {
        this.massivPrepyatstviy = prepyatstviya;
        this.dlinnaPrepyatstviy = dlinnaPrepyatstviy;
    }

    public void doIt(Team team) {
        int kolichestvoPrepyatstviy = 1;
        System.out.println("Команда " + team.getNameOfTeam() + " на старт!");
        System.out.println("Необходимо пройти препятствия: ");
        for (String prepyatstvie : massivPrepyatstviy) {
            System.out.println(kolichestvoPrepyatstviy + ". " + prepyatstvie
                    + ". Длинна припятствия: " + this.dlinnaPrepyatstviy[kolichestvoPrepyatstviy-1]);
            kolichestvoPrepyatstviy++;
        }
    }

    public int dlinnaVsehPrepyatstviy() {
        int dlinnaVsehPrepyatstviy=0;
        for (int dlinnaPrepyatstviya : dlinnaPrepyatstviy) {

            dlinnaVsehPrepyatstviy += dlinnaPrepyatstviya;
        }
        return dlinnaVsehPrepyatstviy;
    }


}
