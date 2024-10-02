import java.util.Scanner;

public class Bidoof extends PokemonCharacteristics {

    private int smash;
    private int flash;
    private int magnitude;
    private int evasion;

    // constructor
    public Bidoof(String pokemon, String type, int weight, String rarity, int hp, int level) {
        super(pokemon, type, weight, rarity, hp, level);
    }

    // methods

    public void Train(){
        Scanner trainChoice = new Scanner(System.in);
        System.out.println("Which move do you want to train?" +
                "\n [1] Smash" +
                "\n [2] Flash" +
                "\n [3] Magnitude" +
                "\n [4] Evasion");
        String trainMove = trainChoice.nextLine();

        Scanner trainTimeInput = new Scanner(System.in);
        System.out.println("How long do you want to train? ");
        int trainTime = trainTimeInput.nextInt();

        if(trainMove == "1"){
            System.out.println("Bidoof increased Smash");
        } else if (trainMove == "2") {
            System.out.println("Bidoof increased Smash");
        } else if (trainMove == "3"){
            System.out.println("Bidoof increased Smash");
        } else if (trainMove == "4") {
            System.out.println("Bidoof increased Smash");
        }

        int xp = trainTime * 5;

        xpIncrease(xp);

    }

    private void xpIncrease(int xp) {
        float newLevel = level + (xp/100);
        if(newLevel >= level + 1){
            System.out.println("Bidoof leveld up and is now level " + newLevel);
        }
    }



    @Override
    public int hpDown(int hp, int damage) {
        this.hp = hp;
        System.out.println("The attack was in-effective against Bidoof.");
        return hp - damage + 3;
    }

    // setters
    public int setSmash(){
        int damage = 12+(12*(1+(level/100)));
        System.out.println("Bidoof attacked with smash");
        return damage;
    }
    public int setFlash(){
        System.out.println("Bidoof attacked with flash.");
        return 3+(3*(1+(level/100)));
    }
    public int setMagnitude(){
        int damage = 30+(30*(1+(level/100)));
        System.out.println("Bidoof attacked with magnitude.");
        return damage;
    }
    public int setEvasion(){
        System.out.println("Bidoof used evasion.");
        return 5+(5*(1+(level/100)));
    }

    // getters
    public void getSmash(int smash) {
        this.smash = smash;
    }
    public void getFlash(int flash) {
        this.flash = flash;
    }
    public void getMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }
    public void getEvasion(int evasion) {
        this.evasion = evasion;
    }
}

