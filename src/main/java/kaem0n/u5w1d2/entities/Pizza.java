package kaem0n.u5w1d2.entities;

import java.util.List;

public class Pizza extends Food {
    private final String name;
    private final List<Topping> toppings;


    public Pizza(String name, List<Topping> toppings) {
        this.name = name;
        this.toppings = toppings;
        this.price = 6.99;
        this.kcal = 200;
        toppings.forEach(topping -> {
            this.setPrice(this.price + topping.getPrice());
            this.setKcal(this.kcal + topping.getKcal());
        });
    }

    public String getName() {
        return name;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza " + name + " " + toppings +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
