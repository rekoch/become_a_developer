package ch.arseekay;

import java.util.ArrayList;
import java.util.List;

public class Bakery {
    private final List<Cake> cakesOfBakery = new ArrayList<>();

    Bakery() {
        setupCakesToSell();
    }

    private void setupCakesToSell() {
        cakesOfBakery.add(new Cake("Erdbeere", 14.20));
        cakesOfBakery.add(new Cake("Schokolade", 18.10));
        cakesOfBakery.add(new Cake("Honig", 23.20));
        cakesOfBakery.add(new Cake("Blaubeere", 13.00));
    }

    List<String> getListOfCakes() {
        List<String> listOfCakes = new ArrayList<>();
        for (Cake cake : cakesOfBakery) {
            listOfCakes.add(cake.getName());
        }
        return listOfCakes;
    }

    /**
     * calculate price for an amount of a cakes
     *
     * @param amountOfCakes amount of the same cake
     * @param nameOfCake    the name of the cake as string
     * @return amount if cake exists, 0 if none exists
     */
    double getPriceForAmountOfCake(int amountOfCakes, String nameOfCake) {
        for (Cake cake : cakesOfBakery) {
            if (cake.getName().equalsIgnoreCase(nameOfCake)) {
                return amountOfCakes * cake.getPrice();
            }
        }
        return 0;
    }

    /**
     * Bakes an amount of a cake
     *
     * @param nameOfCake    object of Type Cake, which needs to be baked
     * @param amountOfCakes amount of cakes
     * @return a list of baked cakes
     */
    List<Cake> bakeAmountOfCakes(String nameOfCake, int amountOfCakes) {
        List<Cake> bakedCakes = new ArrayList<>();
        for (Cake cake : cakesOfBakery) {
            if (cake.getName().equalsIgnoreCase(nameOfCake)) {
                for (int i = 0; i < amountOfCakes; i++) {
                    bakedCakes.add(cake.bakeCake());
                }
            }
        }
        return bakedCakes;
    }
}
