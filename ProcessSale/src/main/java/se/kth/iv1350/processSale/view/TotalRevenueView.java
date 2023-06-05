package se.kth.iv1350.processSale.view;

/**
 * The class TotalRevenueView shows the total income of the sales on the user interface
 */
public class TotalRevenueView extends RevenueObserverTemplate {
    
    /**
     * Constructor for TotalRevenueView
     */
    public TotalRevenueView() {}


    @Override
    protected void doShowRevenue(float income) throws Exception {
        System.out.println("-Returned by the observer: Total revenue -\n" + "Total revenue: " + totalRevenue + "\n");
    }

    @Override
    protected void handleErrors(Exception e) { return; }
}