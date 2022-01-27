/**
 * Classe publique principale (Main) de la fonctionnalité HeadsOrTails
 */
public class HeadsOrTails {

    /**
     * Méthode publique statique main de la classe HeadsOrTails
     * @param args arguments
     */
    public static void main(String[] args) {
        LaunchCoin launchCoin = new LaunchCoin();
        System.out.println("\n----- HEAD OR TAIL -----\n");
        System.out.println("Résultat du lancement : "+launchCoin.Toss());
    }
}
