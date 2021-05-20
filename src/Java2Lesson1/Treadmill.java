package Java2Lesson1;

public class Treadmill implements Obstaclable {
    int length;

    public Treadmill (int length) {
        this.length = length;
    }

    @Override
    public boolean toRun (int maxLength) {
        return maxLength >= length;
    }

    @Override
    public boolean toJump (int maxHeight) {
        return false;
    }

    @Override
    public String toString () {
        return " беговую дорожку длиной" + length + "м";
    }
}
