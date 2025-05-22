public class AuctionApp {
    public static void main(String[] args) {
        Auction auction = new Auction("iPhone");

        auction.registerBidder(new Buyer("Ali"));
        auction.registerBidder(new Buyer("Ayesha"));

        auction.placeBid(50000);
        auction.placeBid(55000);
        auction.placeBid(60000);
    }
}
