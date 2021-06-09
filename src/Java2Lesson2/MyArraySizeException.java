package Java2Lesson2;

public class MyArraySizeException extends  Exception {
    public int i;
    public int j;

    void MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }

}

