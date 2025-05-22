import java.util.ArrayList;
import java.util.List;

public class Auction {
    private List<Bidder> bidders = new ArrayList<>();
    private double highestBid = 0;
    private String item;

    public Auction(String item) {
        this.item = item;
    }

    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    public void placeBid(double amount) {
        if (amount > highestBid) {
            highestBid = amount;
            notifyBidders();
        }
    }

    private void notifyBidders() {
        for (Bidder bidder : bidders) {
            bidder.update(item, highestBid);
        }
    }
}
