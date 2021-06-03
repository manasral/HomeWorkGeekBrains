package Java2Lesson1;

public class Human implements JumpAndRun {
    int maxHeight;
    int maxLength;
    String name;


    Human (int maxHeight, int maxLength, String name) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }



    @Override
    public int getMaxHeight () {
        return maxHeight;
    }

    @Override
    public void jump () {
        System.out.println("Human jump");
    }

    @Override
    public int getMaxLength () {
        return maxLength;
    }

    @Override
    public void run () {
        System.out.println("Human run");

    }
    @Override
    public String toString () {
        return "Человек по имени" + name;
    }
}
