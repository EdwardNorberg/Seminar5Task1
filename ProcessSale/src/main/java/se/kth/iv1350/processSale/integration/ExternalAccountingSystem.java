package se.kth.iv1350.processSale.integration;

import java.util.List;
import java.util.ArrayList;

import se.kth.iv1350.processSale.model.Receipt;
import se.kth.iv1350.processSale.model.RevenueObserver;

/**
 * The external accounting system contains accounting information. Calls are only made 
 * to the class from the controller
 */
public class ExternalAccountingSystem {
    private List<RevenueObserver> revenueObservers;
    
    /**
     * Creates a new instance of the external accounting system.
     */
    public ExternalAccountingSystem() {
        this.revenueObservers = new ArrayList<>();
    }
    
    /**
     * Recieves receipt/sale information. But since external systems are not modeled in this
     * exercise we choose to leave it blank.
     * 
     * @param receipt the {@link Receipt} to be handled by the accounting system
     */
    public void sendSaleInformation(Receipt receipt) {
        notifyObservers(receipt);
    }

    private void notifyObservers(Receipt receipt) {
        for (RevenueObserver observer : revenueObservers){
            observer.registerNewSale(receipt.getTotalPrice());
        }
    }

    /**
     * Adds the an observer to the list of observers.
     * 
     * @param observer the observer to be added
     */
    public void addRevenueObserver(RevenueObserver observer) {
        revenueObservers.add(observer);
    }
}
