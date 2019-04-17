package info.sjd.controller;

import info.sjd.model.Result;
import info.sjd.service.Service;
import info.sjd.util.Timer;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/** @author VTyma
 * Main class to start calculation of the max profit - start()!
 */

@Slf4j
public class Controller {

    public Controller() {
    }

    public void start(int[] array, boolean showTimings) {
        long startTime;
        long endTime;
        int profit;


        if (array.length <= 100) {
            log.info(String.format("Array is %s", Arrays.toString(array)));
        } else {
            log.info(String.format("Array (first 10 elements) is %s ...",
                     Arrays.toString(Arrays.copyOf(array, 10))));
        }

        startTime = System.nanoTime();

        Result result;// = new Result();

        Service service = new Service();
        try {
            result = service.getProfit(array);

            log.info("************************************************");
            log.info(String.format("Max profit is %d for elements #%d (buy at %d) and #%d (sell at %d)",
                     result.getProfit(),
                     result.getIndex()+1, result.getValue(),
                     result.getMaxForThisIndex()+1, result.getMaxForThisValue()));
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

