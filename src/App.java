// import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pokemon Charmander = new Pokemon();
        Charmander.Property("Charmander", 1, 8, 30, 6);        
        Charmander.PropertyPrintout();

        Pokemon Balbasaur = new Pokemon();
        Balbasaur.Property("Balbasaur", 1, 7, 30, 6);
        Balbasaur.PropertyPrintout();

        Charmander.Fight(Charmander, Balbasaur);

    }
}
