package info.sjd.controller;

import info.sjd.service.Service;
import info.sjd.util.Timer;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Controller {

    public Controller() {
    }

    /** @author VTyma
     * Main method to start calculation of the max profit!
     */
    public void start(int[] array, boolean showTimings) {
        long startTime;
        long endTime;
        int profit;


        log.info(String.format("Array is %s", Arrays.toString(array)));
        startTime = System.nanoTime();

        Service service = new Service();
        try {
            profit = service.getProfit(array);

            log.info("************************************************");
            log.info(String.format("Max profit is %d", profit));
            log.info("************************************************");

        } catch (Exception e) {
            log.error(String.format("Error: [%s].", e.getMessage()));
        }

        endTime = System.nanoTime();

        if (showTimings){
            log.info(Timer.elapsed(startTime, endTime));
        }
    }
}

