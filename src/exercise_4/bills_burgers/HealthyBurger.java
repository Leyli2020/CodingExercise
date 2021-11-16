package exercise_4.bills_burgers;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if (healthyExtra1Name != null) {
            totalPrice += healthyExtra1Price;
        }
        if (healthyExtra2Name != null) {
            totalPrice += healthyExtra2Price;
        }
        return totalPrice;
    }
}
