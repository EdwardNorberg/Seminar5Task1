package se.kth.iv1350.processSale.view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

/**
 * The class TotalRevenueFileOutput logs exceptions and prints them to a file
 */
public class TotalRevenueFileOutput extends RevenueObserverTemplate {
    private static final String LOG_FILE_NAME = "totalRevenue-log.txt";
    private PrintWriter logFile;
    
    /**
     * Constructor for TotalRevenueFileOutput
     */
    public TotalRevenueFileOutput() {}
    

    @Override
    protected void doShowRevenue(float totalPrice) throws IOException {
        File outputFile = new File(LOG_FILE_NAME);
        logFile = new PrintWriter(new FileWriter(outputFile), true);
        logFile.println("Current total revenue: " + totalRevenue + "\n");
    } 

    @Override
    protected void handleErrors(Exception e) {
        e.printStackTrace();
    }

    
}