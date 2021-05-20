package Java2Lesson1;

public class Cat implements JumpAndRun {

    int maxHeight;
    int maxLength;
    String name;

    public Cat (int maxHeight, int maxLength, String name) {
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
        System.out.println("Cat jump");

    }

    @Override
    public int getMaxLength () {
        return maxLength;
    }

    @Override
    public void run () {
        System.out.println("Car run");
    }

    @Override
    public String toString () {
        return "Кот по имени" + name;

    }
}
