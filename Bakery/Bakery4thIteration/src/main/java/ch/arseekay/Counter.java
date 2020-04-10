package ch.arseekay;

import java.util.List;
import java.util.Scanner;

public class Counter {
    Scanner scanner = new Scanner(System.in);
    Bakery bakery = new Bakery();

    void handleOrderFromCustomer() {
       double totalPrice = 0;
        while (true) {
            String cakeName = showOffersAndGetSelectCake();
            int acceptedCakeAmount = getAmountOfCake();
            double acceptedCakePrice = getAcceptedCakePrice(cakeName, acceptedCakeAmount);
            if (acceptedCakePrice == 0) {
                continue;
            }
            totalPrice = acceptedCakePrice + totalPrice;
            List<Cake> bakedCakes = bakery.bakeAmountOfCakes(cakeName, acceptedCakeAmount);
            boolean stillMoreOrders = showConfirmationAndAskForMore(bakedCakes);
            if (!stillMoreOrders) {
                System.out.println("Vielen Dank für deine Bestellung");
                System.out.println("Dein Totalbetrag lautet: " + totalPrice);
                scanner.close();
                return;
            }
        }
    }

    private String showOffersAndGetSelectCake() {
        System.out.println("Wir haben heute folgende Kuchen im Angebot");
        List<String> listOfCakes = bakery.getListOfCakes();
        for (String possibleCake : listOfCakes) {
            System.out.println(possibleCake);
        }
        System.out.println("Welchen Kuchen möchtest du davon bestellen? Bitte gib den Namen an.");
        return scanner.next().toLowerCase();
    }

    private int getAmountOfCake() {
        System.out.println("Wie viele Kuchen möchtest du davon bestellen? Gib die Anzahl ein:");
        return Integer.parseInt(scanner.next().toLowerCase());
    }

    private double getAcceptedCakePrice(String nameOfCake, int amountOfCake) {
        double price = bakery.getPriceForAmountOfCake(amountOfCake, nameOfCake);
        System.out.println("Ist der Preis von " + price + " für dich ok?. Wenn ja, schreibe 'ja'. Ansonsten 'nein'");
        if (scanner.next().toLowerCase().startsWith("j")) {
            return price;
        } else {
            return 0;
        }
    }

    private boolean showConfirmationAndAskForMore(List<Cake> bakedCakes) {
        for (int i = 1; i < bakedCakes.size() +1; i++) {
            System.out.println(bakedCakes.get(i-1).getName() + "-Kuchen mit Nummer " + i + " wurde in Auftrag gegeben");
        }
        System.out.println("Möchtes du noch weitere Kuchen bestellen? Dann schreibe 'ja', sonst 'nein'");
        return scanner.next().toLowerCase().startsWith("j");
    }

}
