package kaem0n.u5w1d2.entities;

public class Drink extends Food {
    private final String name;
    private final int milliliters;

    public Drink(double price, int kcal, String name, int milliliters) {
        super(price, kcal);
        this.name = name;
        this.milliliters = milliliters;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", milliliters=" + milliliters +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
