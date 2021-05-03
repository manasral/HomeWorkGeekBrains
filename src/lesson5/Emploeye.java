package lesson5;

public class Emploeye {
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
    public void print () {
        System.out.println(this);
    }

    static class Employee {
        private String fullName;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Employee (String name, String position, String email, String phone, int salary, int age) {
            this.fullName = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public int getAge () {
            return age;
        }



        @Override
        public String toString () {
            return ("Ф.И.О.: " + fullName + "\n" +
                   "Должность: " + position + "\n" +
                    "Email: " + email + "\n" +
                    "Телефон: " + phone + "\n" +
                    "Зарплата: " + salary + "\n" +
                    "Возраст: " + age);

        }
    }
}
