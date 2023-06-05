package se.kth.iv1350.processSale.view;

import se.kth.iv1350.processSale.model.RevenueObserver;

public abstract class RevenueObserverTemplate implements RevenueObserver {

    float totalRevenue;

    /**
     * Takes in the payment amount from the most recent sale when an observer is notified 
     * and displays the new total revenue from all sales since the start of the program.
     * 
     * @param priceOfTheSaleThatWasJustMade
     */
    public void registerNewSale ( float priceOfTheSaleThatWasJustMade ) {
        float newTotalRevenue = calculateTotalRevenue(priceOfTheSaleThatWasJustMade);
        handleDisplaymentAndErrors (newTotalRevenue);
    }

    private void handleDisplaymentAndErrors (float totalRevenue) {
        try {
            doShowRevenue (totalRevenue);
        } catch ( Exception e ) {
            handleErrors ( e );
        }
    }

    private float calculateTotalRevenue(float priceOfTheSaleThatWasJustMade) {
        this.totalRevenue+= priceOfTheSaleThatWasJustMade;
        return totalRevenue;
    }

    protected abstract void doShowRevenue (float income) throws Exception ;

    protected abstract void handleErrors ( Exception e );
    
}
