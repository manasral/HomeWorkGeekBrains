package lesson5;

public class Employee {

    private final String fullName;
    private final String position;
    private final String email;
    private final String phone;
    private final int salary;
    private final int age;

    public Employee (String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }



    public String getFullName () {
        return fullName;
    }

    public String getPosition () {
        return position;
    }

    public String getEmail () {
        return email;
    }

    public String getPhone () {
        return phone;
    }

    public int getSalary () {
        return salary;
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
