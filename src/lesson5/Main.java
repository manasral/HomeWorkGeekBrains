package lesson5;

public class Main {
    public static void main (String[] args) {
        Employee[] emp = new Employee[5];

        emp[0] = new Employee("Иванов Иван Иванович", " Программист", "iviprogram@mailbox.com", "89202322222", 90000, 45);
        emp[1] = new Employee("Петров Петро Петрович ", "Дизайнер", "petrovpetrov91@mailbox.com", "89201203355", 50000, 28);
        emp[2] = new Employee("Андреев Андрей Андреевич", "Бухгалтер", "adnrew2213@mailbox.com", "89201303033", 100000, 48);
        emp[3] = new Employee("Артемов Артем Артемович", "Сторож", "artemthebest@mailbox.com", "89201504450", 25000, 58);
        emp[4] = new Employee("Владимиров Владимир Владимирович", "Менеджер проектов", "vovavovachuma@mailbox.com", "89201101010", 30000, 32);
        for (Employee employee : emp)
            if ( employee.getAge() > 40 )
                System.out.println(employee);

    }
}
