java.lang.String


public class Buyer implements Bidder {
     String name;

    public Buyer(String name) {
        this.name = name;
    }

    @Override
    public void update(String item, double price) {
        System.out.println(name + ": New bid on " + item + " at Rs." + price);
    }
}

