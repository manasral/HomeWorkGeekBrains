package Java2Lesson1;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        JumpAndRun[] members = {

                new Human(2, 5, " Oleg"),
                new Human(1, 8, " Vova"),
                new Cat(1, 3, " Bars"),
                new Cat(1, 1, " Puhlik"),
                new Robot(3, 10, " Android №1"),
                new Robot(5, 25, " Android №2"),
        };

        Obstaclable[] obstacles = {
                new Treadmill(1),
                new Treadmill(5),
                new Wall(1),
                new Wall(2),


        };


        for (JumpAndRun member : members) {
            System.out.println(" Пройти препятствие готовится " + member);
            System.out.println();
            boolean winner = true;
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " Пробует пройти " + obstacle);
                if ( obstacle.toJump(member.getMaxHeight()) || obstacle.toRun(member.getMaxLength()) ) {
                    System.out.println(" У  него  получилось! ");

                } else {
                    winner = false;
                    System.out.println(" У него не получается пройти препятствие ");
                    break;
                }

            }
            if ( winner ) {
                System.out.println(" Прошел  все препятсвия ");
            } else {
                System.out.println(member + " Проиграл ");
            }
            System.out.println();
        }
    }
}


