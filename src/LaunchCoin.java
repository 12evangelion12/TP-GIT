import java.util.Random;

/**
 * Classe publique qui permet de jouer au jeu pile ou face
 */
public class LaunchCoin {

    /**
     * Constructeur par défaut de la classe LaunchCoin
     */
    public LaunchCoin() {}

    public String Toss() {
        Random random = new Random();
        int face = random.nextInt(2);
        //Pile
        if (face == 0) {
            return "Pile";
        }
        //Face
        else {
            return "Face";
        }
    }

}
