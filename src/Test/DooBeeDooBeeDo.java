package Test;

class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String song;

        while (beerNum > 0) {

            if ( beerNum == 99 ) {
                song = "бутылка "; // В единственном числе - ОДНА БУТЫЛКА.
                System.out.println(beerNum + " " + song + "пива на стене");
                System.out.println("Возьми еще одну");
                System.out.println("Пусти по кругу");
                beerNum = beerNum - 1;
                if ( beerNum > 0 ) {
                    System.out.println(beerNum + " " + song + " пива на стене");
                } else {
                    System.out.println("Нет бутылок на стене");

                }
            }
        }

    }
}

