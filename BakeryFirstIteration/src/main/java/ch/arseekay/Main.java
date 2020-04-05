package ch.arseekay;

public class Main {

    /**
     * @param args nimmt x beliebige Werte vom Typ "String" entgegen
     */
    public static void main(String[] args) {
	    Bakery bakery = new Bakery();
        String cake = bakery.bakeCake("Erdbeere", 20.22);
        System.out.println(cake);
    }
}
