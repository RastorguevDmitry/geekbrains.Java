package lesson1.team;

import lesson1.animals.Animal;
import lesson1.course.Course;

//Добавить класс Team, который будет содержать: название команды,
// массив из 4-х участников (т.е. в конструкторе можно сразу всех участников указывать),
// метод для вывода информации о членах команды прошедших дистанцию, метод вывода информации
// обо всех членах команды.
public class Team {

    private String nameOfTeam;
    private Animal[] team;

    //задать команду, указав название и перечислив участников
    public Team(String nameOfTeam, Animal... memberOfTam) {
        this.nameOfTeam = nameOfTeam;
        this.team = memberOfTam;
    }

    // узнать имя команды
    public String getNameOfTeam() {
        return nameOfTeam;
    }

//    //задать название команды
//    public void setNameOfTeam(String nameOfTeam) {
//        this.nameOfTeam = nameOfTeam;
//    }
//
//    //вернуть массив участников
//    public Animal[] getTeam() {
//        return team;
//    }
//
//    //задать участников массивом
//    public void setTeam(Animal[] team) {
//        this.team = team;
//    }

    // напечатать имена участников команды
    public void getAllNamesOfMember() {
        System.out.println("Состав команды " + nameOfTeam);
        int nomerMember = 1;
        for (Animal memberOfteam : team) {
            System.out.println(nomerMember + ". " + memberOfteam.getName() + ". Скорость "+ memberOfteam.run());
            nomerMember++;
        }
    }

    public void whoRiсhedFinish(Course course) {
        int dlinnaVsehPrepyatstviy = course.dlinnaVsehPrepyatstviy();
        System.out.println("Состав команды " + nameOfTeam);
        int nomerMember = 1;
        for (Animal memberOfteam : team) {
            System.out.println(nomerMember + ". " + memberOfteam.getName() + ". Прошел дистанцию за "
                    + dlinnaVsehPrepyatstviy/ memberOfteam.run() );
            nomerMember++;
        }
    }

}
