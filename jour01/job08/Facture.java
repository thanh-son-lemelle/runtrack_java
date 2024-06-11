package job08;

public class Facture {
    public static void main(String[] args) {
        /*
         * Declare a variable of type double named prixHT and assign it the value 49.99
         * Declare a variable of type int named quantite and assign it the value 3
         * Declare a variable of type double named tauxTVA and assign it the value 20.0
         * Declare a variable of type double named prixTTC and assign it the value of the price including tax
         * Print the value of the variable prixTTC to the terminal
         */
        double prixHT = 49.99;
        int quantite = 3;
        double tauxTVA = 20.0;
        double prixTTC = (prixHT + (prixHT * (tauxTVA / 100)))*quantite;
        System.out.println("prixTTC: " + prixTTC + " euro pour " + quantite +" articles");
        System.out.println("prixHT: " + prixHT*quantite + " euro pour "+ quantite +" articles");
        System.out.println("prix unitaire: " + prixHT + " euro");
        System.out.println("TVA: " + (prixTTC-(prixHT*quantite)) + " euro pour "+ quantite +" articles");

    }

}
