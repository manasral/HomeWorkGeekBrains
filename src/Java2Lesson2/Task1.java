package Java2Lesson2;

import java.util.*;

public class Task1 {
    public static void main (String[] args) {
        List <String> fruits = Arrays.asList(
                "Apple", "Orange","Apple","Pineapple","Watermelon","Strawberry",
                "Apple","Grapefruit","Apple","Banana ","Pineapple","Grapefruit ","Strawberry","Apple"
        );
        Set <String> unique = new HashSet<String>(fruits);
        System.out.println("Первоначальное значение");
        System.out.println(fruits.toString());
        System.out.println("Уникальные слова(повторяющиеся)");
        System.out.println(unique.toString());
        System.out.println("Частота повтора слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(fruits, key));
        }
    }
}
