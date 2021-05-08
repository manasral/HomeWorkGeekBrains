package lesson6;

public class Dog extends Animal {
    String dogName;

    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;
    private final double MAX_JUMP_HEIGTH = 1.5;

    public Dog (String dogName){
        this.name = dogName;

    }

    @Override
    void run (int length) {
        if ( (length >= 0) && (length <= MAX_RUN_LENGTH) ) System.out.println("run: true");
    }

    public String getDogName () {
        return dogName;
    }

    public int getMAX_RUN_LENGTH () {
        return MAX_RUN_LENGTH;
    }

    public int getMAX_SWIM_LENGTH () {
        return MAX_SWIM_LENGTH;
    }

    public double getMAX_JUMP_HEIGTH () {
        return MAX_JUMP_HEIGTH;
    }

    public void setDogName (String dogName) {
        this.dogName = dogName;
    }

    @Override
    void swim (int length) {
        if ( (length >= 0) && (length <= MAX_SWIM_LENGTH) ) System.out.println("swim: true");
        else System.out.println("swim: false");
    }

    @Override
    void jump (double height) {
        if ( (height >= 0) && (height <= MAX_JUMP_HEIGTH) ) System.out.println("jump: true");
        else System.out.println("jump: false");
    }
}