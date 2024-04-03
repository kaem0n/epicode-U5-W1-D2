package kaem0n.u5w1d2.entities;

public abstract class Food {
    protected double price;
    protected int kcal;

    protected Food(double price, int kcal) {
        this.price = price;
        this.kcal = kcal;
    }

    public Food() {
    }

    public double getPrice() {
        return price;
    }

    public int getKcal() {
        return kcal;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }
}
