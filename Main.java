import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rosalia rosalia = new Rosalia("Rosalia", "grass", 23, "common", 34,12);

        rosalia.attack();
        rosalia.Talk();
        rosalia.hpDown(34, 3);
        rosalia.hpUp(34, 3);

        Bidoof bidoof = new Bidoof("Bidoof", "normal", 30, "common", 27, 11);
        bidoof.Train();
        bidoof.hpDown(27, 1);
        bidoof.hpUp(27, 1);


        System.out.println(bidoof.getName());
        System.out.println(bidoof.getWeight());
        System.out.println(bidoof.getHp());

        System.out.println(bidoof.setSmash());

    }



}
