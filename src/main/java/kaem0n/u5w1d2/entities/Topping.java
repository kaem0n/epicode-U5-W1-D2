package kaem0n.u5w1d2.entities;

public class Topping extends Food {
    private final String name;

    public Topping(double price, int kcal, String name) {
        super(price, kcal);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
