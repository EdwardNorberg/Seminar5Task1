package se.kth.iv1350.processSale.model;

/**
 * This interface is used to observe the total revenue of all sales.
 */
public interface RevenueObserver {

    /**
     * Prints the total revenue of all sales.
     * 
     * @param totalPrice
     */
    void registerNewSale(float totalPrice);
}