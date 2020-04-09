package ch.arseekay;

public class Bakery {

    Cake[] bakeCake(String cakeName, double cash, int amountOfCakes){
        String [] cakeList = {"Erdbeere", "Schokolade", "Honig"};
        double price = 19.95;
        boolean isNameValid = false;

        for (String validCakeName : cakeList) {
            if (cakeName.equalsIgnoreCase(validCakeName)) {
                isNameValid = true;
                break;
            }
        }

        if (amountOfCakes < 0 || cash < amountOfCakes * price || !isNameValid) {
            return null;
        }

        Cake [] cakes = new Cake [amountOfCakes];

        for (int i = 0; i < cakes.length; i++) {
            cakes[i] = new Cake(cakeName, price);
        }
        return cakes;
    }
}
