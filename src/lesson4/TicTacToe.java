package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static final char[][] map = new char[SIZE][SIZE];

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if ( isWin(DOT_X) ) {
                System.out.println("Человек победил");
                break;
            }
            if ( isMapFull() ) {
                System.out.println("Ничья");
                break;
            }
            computerTurn();
            printMap();
            if ( isWin(DOT_O) ) {
                System.out.println("Копмьютер победил");
                break;
            }
            if ( isMapFull() ) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if ( map[i][j] == DOT_EMPTY ) {
                    return false;
                }

            }

        }
        return false;
    }


//    private static boolean isWin(char symbol) {
//        if ( map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol ) return true;
//        if ( map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol ) return true;
//        if ( map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol ) return true;
//
//        if ( map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol ) return true;
//        if ( map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol ) return true;
//        if ( map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol ) return true;
//
//        if ( map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol ) return true;
//        if ( map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol ) return true;
//
//        return false;
//
//
//    }
public static boolean isWin(char playerDot) {
    int hor, ver;
    int diagMain, diagReverse;
    for (int i = 0; i < SIZE; i++) {
        hor = 0;
        ver = 0;
        for (int j = 0; j < SIZE; j++) {
            if (map[i][j] == playerDot) {                          // проверяем горизонтальные линии на возможную победу
                hor++;
            } else if (map[i][j] != playerDot && hor < DOTS_TO_WIN) {
                hor = 0;
            }
            if (map[j][i] == playerDot) {                          // проверяем вертикальные линии на возможную победу
                ver++;
            }   else if (map[j][i] != playerDot && ver < DOTS_TO_WIN) {
                ver = 0;
            }
        }
        if (hor >= DOTS_TO_WIN || ver >= DOTS_TO_WIN) {
            System.out.println("По горизонтали или вертикали " + hor + " " + ver);
            return true;
        }
    }

    for (int j = 0; j < SIZE; j++) {
        diagMain = 0;
        for (int i = 0; i < SIZE; i++) {
            int k = j + i;
            if (k < SIZE) {
                if (map[i][k] == playerDot) {                      // проверяем главную диагональ от центральной оси вправо на возможную победу
                    diagMain++;
                } else if (map[i][k] != playerDot && diagMain < DOTS_TO_WIN) {
                    diagMain = 0;
                }
            }
            if (diagMain >= DOTS_TO_WIN) {
                System.out.println("По главной диагонали от центральной оси вправо " + diagMain);
                return true;
            }
        }
    }
    for (int j = 1; j < SIZE; j++) {
        diagMain = 0;
        for (int i = 0; i < SIZE; i++) {
            int k = j + i;
            if (k < SIZE) {
                if (map[k][i] == playerDot) {                      // проверяем главную диагональ от центральной оси вниз на возможную победу
                    diagMain++;
                } else if (map[k][i] != playerDot && diagMain < DOTS_TO_WIN) {
                    diagMain = 0;
                }
            }
            if (diagMain >= DOTS_TO_WIN) {
                System.out.println("По главной диагонали от центральной оси вниз " + diagMain);
                return true;
            }
        }
    }
    for (int j = 0; j < SIZE; j++) {
        diagReverse = 0;
        for (int i = 0; i < SIZE; i++) {
            int k = (SIZE - 1) - i;
            int l = j + i;
            if (k >= 0 && l <SIZE) {
                if (map[l][k] == playerDot) {                     // проверяем побочную диагональ от центральной оси вниз на возможную победу
                    diagReverse++;
                } else if (map[l][k] != playerDot && diagReverse < DOTS_TO_WIN) {
                    diagReverse = 0;
                }
            }
            if (diagReverse >= DOTS_TO_WIN) {
                System.out.println("По побочной диагонали от центральной оси вниз " + diagReverse);
                return true;
            }
        }
    }
    for (int j = 1; j <SIZE; j++) {
        diagReverse = 0;
        for (int i = 0; i < SIZE; i++) {
            int k = (SIZE - 1) - j - i;
            if (k >= 0) {
                if (map[i][k] == playerDot) {     // проверяем побочную диагональ от центральной оси влево на возможную победу
                    diagReverse++;
                } else if (map[i][k] != playerDot && diagReverse < DOTS_TO_WIN) {
                    diagReverse = 0;
                }
            }
            if (diagReverse >= DOTS_TO_WIN) {
                System.out.println("По побочной диагонали от центральной оси влево " + diagReverse);
                return true;
            }
        }
    }
    return false;
}

    private static void printMap() {
        printHeader();
        printBody();
        System.out.println();
    }

    private static void computerTurn() {
        int x;
        int y;

        Random random = new Random();
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
            if (map[x][y] == DOT_EMPTY & map[x][y] !=DOT_X) {
                break;
            }
        } while (true) ;

//        ((map[x][y] != DOT_EMPTY && map[x][y] !=DOT_X))
        map[x][y] = DOT_O;


    }

    private static void humanTurn() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите координаты в формате X Y");
            x = readInt(scanner) - 1;
            y = readInt(scanner) - 1;
            if ( x == -1 || y == -1 ) {
                System.out.println("Координаты должны быть числом!");
                scanner.nextLine();
            } else if ( x < 0 || x >= SIZE || y < 0 || y >= SIZE ) {
                System.out.println("Данные введены некорректно!");
            } else if ( map[x][y] != DOT_EMPTY ) {
                System.out.println("Клетка уже занята!");
            } else {
                break;
            }
        } while (true);
        map[x][y] = DOT_X;
    }

    private static int readInt(Scanner scanner) {
        return scanner.hasNextInt() ? scanner.nextInt() : -1;
    }

    private static void printBody() {

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();

        }
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
        }

    }
}
