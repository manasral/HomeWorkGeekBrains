package lesson3;

import java.util.Arrays;

import static java.lang.System.*;

public class HomeWork2 {


    public static void main(String[] args) {
        ChekArray();
        FillArray();
        ChangeArray();
        SquareArray();
        MinMax();
        fillArray(10,10);
    }

    public static void ChekArray() {

        out.println("Задание 1");
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (array1[i] == 0) ? 1 : 0;
            out.println(Arrays.toString(array1));
        }
    }

    public static void FillArray() {
        out.println("Задание 2");
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            out.println((i));
        }
    }

    public static void ChangeArray() {
        out.println("Задание 3");
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxMas = mas.length;
        for (int i = 0; i < maxMas; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for (int i = 0; i < maxMas; i++) {
            out.print(i + "-" + mas[i] + " ");
            out.println();
        }
    }

    public static void SquareArray() {
        out.println("Задание 4");
        int a = 5;
        int[][] diagonal = new int[5][5];
        for (int i = 0; i < a; i++) {
            diagonal[i][i] = 1;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++)
                out.printf("%3d", diagonal[i][j]);
            out.println();

        }
    }

    public static void fillArray(int len, int initialValue) {
        out.println("Задание 5");
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        out.println(Arrays.toString(arr));


    }


    public static void MinMax() {
        out.println("Задание 6");
        int[] mas = {3, 5, 1, 3, 6, 6, 4, 5};
        int min = mas[0], max = mas[0], i, imin = 0, imax = 0;
        for (i = 0; i != mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                imin = i;
            }
            if (mas[i] > max) {
                max = mas[i];
                imax = i;
            }
            out.println("max = " + max + " min = " + min);
            out.println("imax = " + imax + " imin = " + imin);

        }
    }
}







