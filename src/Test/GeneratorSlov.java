package Test;

public class GeneratorSlov {
    public static void main(String[] args) {
        String [] wordListOne = {"петя"," коля", " аня", "вася","маша"," ирина", " вова", "даша"};
        String [] worldListTwo = {"гуляет"," ест", " бежит", "орет","плывет"," летит", " сидит", "спит"};
        String [] worldListThree = {"собака"," кошка", " кит", "корова","бык"," попугай", " орел", "акула"};

        int oneLength = wordListOne.length;
        int twoLength = worldListTwo.length;
        int threeLength = worldListThree.length;

        int random1 = (int) (Math.random() * oneLength);
        int random2 = (int) (Math.random() * twoLength);
        int random3 = (int) (Math.random() * threeLength);

        String pharse = wordListOne[random1] + " " + worldListTwo[random2] + " " + worldListThree[random3];
        System.out.println("Все, что нам нужно, - это " + pharse);
    }
}
