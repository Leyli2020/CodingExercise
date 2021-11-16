package exercise_4.bills_burgers;

public class Hamburger {
    private double price;
    private String name;
    private String meat;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;
        if (addition2Name != null) {
            totalPrice += addition1Price;
        }
        if (addition2Name != null) {
            totalPrice += addition2Price;
        }
        if (addition3Name != null) {
            totalPrice += addition3Price;
        }
        if (addition4Name != null) {
            totalPrice += addition4Price;
        }
        return totalPrice;
    }
}
