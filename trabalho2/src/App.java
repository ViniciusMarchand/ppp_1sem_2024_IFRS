
public class App {
    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer("Pedro");
        
        Competitor artur = new Competitor("Artur");
        Competitor vinicius = new Competitor("Vinicius");

        auctioneer.addObersver(artur);
        auctioneer.addObersver(vinicius);
        
        auctioneer.changeState(50.75f);

        auctioneer.removeObserver(artur);

        auctioneer.changeState(40.75f);

        auctioneer.changeState(85.30f);


    }
}