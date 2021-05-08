package lesson6;

abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;
    private final double MAX_JUMP_HEIGTH = 0;

    String name;


    public Animal () {
    }

    public Animal (String name) {
        this.name = name;
    }

    public void animalInfo () {
        System.out.println("Животное: " + name);
    }


    abstract void run (int length);

    abstract void swim (int length);

    abstract void jump (double height);
}

