package lesson6;

public class ResultRunJumpSwim {
    public static void main(String[] args) {
        String catName;
        catName = "Barsk:";
        System.out.println("Cat " + catName);
        Cat cat = new Cat ("");
        cat.run(150);
        cat.swim(1);
        cat.jump(2);


        catName = "Murzik";
        System.out.println("Cat " + catName);
        Cat cat2 = new Cat("Murzik");
        cat.run(220);
        cat.swim(1);
        cat.jump(2);

        String dogName;
        dogName = "Baron";
        System.out.println("Dog " + dogName);
        Dog dog = new Dog ("");
        dog.run(500);
        dog.swim(10);
        dog.jump(1.5);


        dogName = "Boris";
        System.out.println("Dog " + dogName);
        Dog dog2 = new Dog ("");
        dog.run(500);
        dog.swim(10);
        dog.jump(1.5);
    }
}

