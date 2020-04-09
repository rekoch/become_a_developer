package ch.arseekay;

import java.util.Scanner;

public class Main {

    /**
     * @param args nimmt x beliebige Werte vom Typ "String" entgegen
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bakery bakery = new Bakery();

        System.out.println("Bitte gib deine Bestellung auf.");

        while (true) {
            System.out.println("Welche Kuchensorte möchtest du bestellen? Gib den Namen ein:");
            String scannerInput = scanner.next();
            String cakeName = scannerInput.toLowerCase();
            System.out.println("Wie viele Kuchen möchtest du davon bestellen? Gib die Anzahl ein:");
            scannerInput = scanner.next();
            int amountOfCake = Integer.parseInt(scannerInput.toLowerCase());
            System.out.println("Gib den Betrag ein für die Bezahlung. Jeder Kuchen kostet 19.95");
            scannerInput = scanner.next();
            int cash = Integer.parseInt(scannerInput.toLowerCase());
            System.out.println("hier deine Bestellung");

            Cake[] cakes = bakery.bakeCake(cakeName, cash, amountOfCake);
            if (cakes != null) {
                for (int i = 1; i < cakes.length +1; i++) {
                    System.out.println(cakes[i-1].name + "-Kuchen nummer " + i);
                }
            }
            System.out.println("wenn du genügend Kuchen bestellt hast, gib 'q' ein. Ansonsten 'w' für weiter.");
            scannerInput = scanner.next();
            if (scannerInput.equalsIgnoreCase("q")) {
                break;
            }
        }
        System.out.println("vielen Dank für die Bestellungen");
        scanner.close();
    }
}
