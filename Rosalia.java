public class Rosalia extends PokemonCharacteristics {
    public String moveOne;
    public String moveTwo;
    public String moveThree;
    public String moveFour;

    public Rosalia( String pokemon, String type, int weight, String rarity, int hp, int level,  String moveOne, String moveTwo, String moveThree, String moveFour){
        super(pokemon, type, weight, rarity, hp, level);
        System.out.println(pokemon + " is a " + type + " pokémon and weights " + weight + " pounds");
    }


}
