package ch.arseekay;

public class Main {

    /**
     * @param args nimmt x beliebige Werte vom Typ "String" entgegen
     */
    public static void main(String[] args) {
	    Bakery bakery = new Bakery();
        String[] cakes = bakery.bakeCake("Schokolade", 20.22, -1);
        if (cakes != null) {
            for (String cake : cakes) {
                System.out.println(cake);
            }
        }
    }
}
