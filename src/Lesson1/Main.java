package Lesson1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWord();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWord()
    {
        System.out.println("Задание 2");
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign() {
        System.out.println("Задание 3");
        int a = 20, b = -30;
        int c = a + b;
        if (c >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицительная");
        System.out.println();

    }

    public static void  printColor() {
        System.out.println("Задание 4");
        int value = -5;
        if (value <=0) System.out.println("Красный");
        if (value >0 && value<=100) System.out.println("Желтый");
        if ((value >100)) System.out.println("Зеленый");
        System.out.println();


    }
    public static void compareNumbers() {
        System.out.println("Задание 5");
        int a = 33, b = 12;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
        System.out.println();
    }
    }


