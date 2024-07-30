public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket googleStock = new StockMarket("GOOGL");

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        googleStock.registerObserver(mobileApp);
        googleStock.registerObserver(webApp);

        googleStock.setStockPrice(1500.00);
        googleStock.setStockPrice(1550.00);
    }
}
