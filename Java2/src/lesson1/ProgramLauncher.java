package lesson1;

import lesson1.animals.Animal;
import lesson1.animals.Cat;
import lesson1.course.Course;
import lesson1.team.Team;
import lesson1.valuestype.Gender;

public class ProgramLauncher {
    public static void main(String[] args) {
        Cat Vasya = new Cat(2, "Vasya", Gender.MALE);
        Cat Katya = new Cat(3, "Katya", Gender.FEMALE);
        Cat Masha = new Cat(5, "Masha", Gender.FEMALE);
        Cat Barsik = new Cat(5, "Barsik", Gender.MALE);


//        Course c = new Course(...); // Создаем полосу препятствий
//        Team team = new Team(...); // Создаем команду
//        c.doIt(team); // Просим команду пройти полосу
//        team.showResults(); // Показываем результаты

        String[] massivPrepyatstviy = {"ручей", "змейка", "горка"};
        int[] dlinnaPrepyatstviy = {10, 5, 15};

        Course course = new Course(massivPrepyatstviy, dlinnaPrepyatstviy);


        Team team = new Team("Кошки", Vasya, Katya, Masha, Barsik);
        team.getAllNamesOfMember();
        course.doIt(team);
        team.whoRiсhedFinish(course);


    }
}
