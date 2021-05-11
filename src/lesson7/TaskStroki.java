package lesson7;

public class TaskStroki {
    public static void main (String[] args) {

        // Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.

        String str = "I Like Java";
        StringProcess(str);
    }

    private static void StringProcess (String str) {
        System.out.println("Распечатать последний символ строки. Используем метод String.charAt().");
        System.out.println(str);
        System.out.print("Последний символ это - \"");
        System.out.println(str.charAt(str.length() - 1) + "\"");

        System.out.println("Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith()");

        String chelEnd = "!!!";
        System.out.println(str);
        System.out.println( "Заканчивается ли ваша строка подстрокой: \"" + chelEnd + "\" : " + str.endsWith(chelEnd));

        System.out.println("Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().");

        String iLike = str;
        System.out.println(str);
        System.out.println( "Начинается ли фраза  \"" + iLike + "\" с I like? :" + str.startsWith(str));

        System.out.println("Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains()");

        String containsCheck = str;
        System.out.println(str);
        System.out.println( "Есть ли тут слово Java? \"" + containsCheck + "\" : " + str.contains(containsCheck));


        System.out.println("Найти позицию подстроки “Java” в строке “I like Java!!!”.");

        String position = str;
        int index = str.lastIndexOf("Java");

        System.out.println("Позиция №:" + index);

        System.out.println("Заменить все символы “а” на “о”.");

        System.out.println(str.replace('a', 'o'));

        System.out.println("Преобразуйте строку к верхнему регистру.");
        System.out.println(str.toUpperCase());

        System.out.println("Преобразуйте строку к нижнему регистру.");
        System.out.println(str.toLowerCase());

        System.out.println("Вырезать строку Java c помощью метода String.substring().");

        String CutJava = "I like Java";
        System.out.println(CutJava.substring(7, 11));


    }

}
