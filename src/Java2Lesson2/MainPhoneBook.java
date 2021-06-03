package Java2Lesson2;

public class MainPhoneBook {
    public static void main (String[] args) {
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("_____________________");

        System.out.println("Наполняем справочник данными");
        phonebook.add("Кузнецов", "55-55-66");
        phonebook.add("Кузнецов", "44-55-55");
        phonebook.add("Петров", "22-66-45");
        phonebook.add("Сидоров", "22-88-55");
        phonebook.add("Кузнецов", "33-44-44");
        System.out.println("_____________________");

        System.out.println("Получаем номера");
        System.out.println("Кузнецов");
        System.out.println(phonebook.get("Кузнецов"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Кузнецов");
        System.out.println(phonebook.get("Кузнецов"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Кузнецов", "55-55-66");
        System.out.println("Кузнецов");
        System.out.println(phonebook.get("Кузнецов"));
    }
}

