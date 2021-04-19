package Lesson2;

public class HomeWork2 {
    static boolean within10and20(int a, int b) {
        System.out.println("Задание 1");
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {
        boolean isInInterval1 = within10and20(20, 10);
        System.out.println(isInInterval1);
        boolean isInInterval2 = within10and20(2, 9);
        System.out.println(isInInterval2);
        boolean isInInterval3 = within10and20(6, 4);
        System.out.println(isInInterval3);

        isPositiveOrNegative(2);
        isPositiveOrNegative(-54);
        isPositiveOrNegative(0);


        boolean isNumber1 = isNegative(2);
        System.out.println(isNumber1);
        boolean isNumber2 = isNegative(-14);
        System.out.println(isNumber2);
        boolean isNumber3 = isNegative(152);
        System.out.println(isNumber3);

        printWordNTimes(6);


    }

    static void isPositiveOrNegative(int a) {
        System.out.println("Задание №2");
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");
    }


    private static boolean isNegative(int number) {
        System.out.println("Задание №4");
        return number < 0;
    }

    public static void printWordNTimes(int a) {
        System.out.println("Задание №5");
        for (int i = 0; i < 8; i++) {
            System.out.println(i);


        }
    }
}




