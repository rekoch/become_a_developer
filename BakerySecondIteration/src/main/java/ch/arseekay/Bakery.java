package ch.arseekay;

public class Bakery {

    String[] bakeCake(String cakeName, double cash, int amountOfCakes){
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

        String [] cakes = new String [amountOfCakes];

        for (int i = 0; i < amountOfCakes; i++) {
            cakes[i] = "ich bin cake nummer " + i + " und bin ein " + cakeName + "-Cake";
        }
        return cakes;
    }
}
