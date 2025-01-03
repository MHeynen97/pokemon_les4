import java.util.Objects;
import java.util.Scanner;

public class Rosalia extends PokemonCharacteristics {
    private int leechLife;
    private int Tackle;
    private int vineTwist;
    private int cut;

    // constructor
    public Rosalia( String pokemon, String type, int weight, String rarity, int hp, int level){
        super(pokemon, type, weight, rarity, hp, level);
        System.out.println(pokemon + " is a " + type + " pokémon and weights " + weight + " pounds");
        this.leechLife = leechLife;
        this.Tackle = Tackle;
        this.vineTwist = vineTwist;
        this.cut = cut;
    }

    // methods

    public void attack(){
        Scanner attackChoiceInput = new Scanner(System.in);
        System.out.println("Which attack do you choose:" +
                "\n [1] Leech life" +
                "\n [2] Tackle" +
                "\n [3] Vine twist" +
                "\n [4] Cut");
        String attackMove = attackChoiceInput.nextLine();

        if(Objects.equals(attackMove, "1")){
            System.out.println("You attacked with leech life");
            getLeechlife(setLeechLife());
        } else if (Objects.equals(attackMove, "2")) {
            System.out.println("You attacked with Tackle");
            getTackle(setTackle());
        } else if (Objects.equals(attackMove, "3")){
            System.out.println("You attacked with Vine twist");
            getVineTwist(setVineTwist());
        } else if (Objects.equals(attackMove, "4")) {
            System.out.println("You attacked with Cut");
            getCut(setCut());
        }
    }

    public void Talk(){
        System.out.println("Rosalia seems to want to communicate with you. ");
        System.out.println("She likes the adventure she's been on");
        Scanner inputUser = new Scanner(System.in);
        System.out.println("How do you respons? ");
        String chatOption = inputUser.nextLine();
        System.out.println("you respond with: " + chatOption);
    }

    @Override
    public int hpDown(int hp ,int damage) {
        this.hp = hp;
        System.out.println("The attack was effective against Rosalia.");
        return hp - damage - 3;
    }

    // setters
    public int setLeechLife(){
        int damage = 10+(10*(1+(level/100)));
        System.out.println("Rosalia attacked with Leech life.");
        return damage;
    }
    public int setTackle(){
        int damage = 5+(5*(1+(level/100)));
        System.out.println("Rosalia attacked with Tackle.");
        return damage;
    }
    public int setVineTwist(){
        int damage = 15+(15*(1+(level/100)));
        System.out.println("Rosalia attacked with Vine Twist.");
        return damage;
    }
    public int setCut(){
        int damage = 5+(5*(1+(level/100)));
        System.out.println("Rosalia attacked with Cut.");
        return damage;
    }

    // getters
    public void getLeechlife(int leechLife){
        this.leechLife = leechLife;
    }
    public void getTackle(int tackle){
        this.Tackle = tackle;
    }
    public void getVineTwist(int vineTwist){
        this.vineTwist = vineTwist;
    }
    public void getCut(int cut){
        this.cut = cut;
    }

}
