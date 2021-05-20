package Java2Lesson1;

public class Robot implements JumpAndRun {

    int maxHeight;
    int maxLength;
    String name;

    public Robot (int maxHeight, int maxLength, String name) {
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
        System.out.println("Robot jump");

    }

    @Override
    public int getMaxLength () {
        return maxLength;
    }

    @Override
    public void run () {
        System.out.println("Robot tun");

    }

    @Override
    public String toString () {
        return "Робот по имени " + name;
    }
}
