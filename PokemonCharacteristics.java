import java.util.Random;

public class PokemonCharacteristics {

    public String pokemon;
    public String type;
    public int weight;
    public String rarity;
    public int hp;
    public int level;

    // constructor
    public PokemonCharacteristics(String pokemon , String type , int weight, String rarity , int hp, int level){
        this.pokemon = pokemon;
        this.type = type;
        this.weight = weight;
        this.rarity = rarity;
        this.hp = hp;
        this.level = level;
    }

    // Methods
    // Hp up
    public int hpUp(int hp, int damage){
        this.hp = hp;
        return hp + damage;
    }
    // Hp down
    public int hpDown(int hp, int damage){
        this.hp = hp;
        return hp - damage;
    }

    // getters
    public String getName(){
        return pokemon;
    }

    public String getType(){
        return type;
    }

    public int getWeight(){
        return weight;
    }

    public String getRarity(){
        return rarity;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }


    // Setters
    public void setName(String name){
        this.pokemon = name;
    }
    public void setType(String type){
        this.type = type;
    }

    public void setWeight(int min, int max){
        Random random = new Random();
        this.weight = random.ints(min, max)
                .findFirst()
                .getAsInt();;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setLevel(int level){
        this.level = level;
    }

}
