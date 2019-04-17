package info.sjd.service;

import info.sjd.model.Result;
import lombok.extern.slf4j.Slf4j;
import java.util.Collections;
import java.util.LinkedList;

@Slf4j
public class Service {

/** @author VTyma
 * Method to calculate the max profit.
 */
    public Result getProfit(int[] array) throws Exception {
        if (array.length < 2) throw new Exception("Profit is not found (there is less then two elements in array)");

        int arrayLength = array.length;

        Result result = new Result();
        Result candidate = new Result();

        /* Set profit to 0 for the beginning*/
        result.setProfit(0);

        /* Convert array to the LinkedList to perform on it reducing operations.*/
        LinkedList<Integer> arrayAsList = new LinkedList<>();
        for(int i : array)
            arrayAsList.add(i);



        for (int i = 0; i < arrayLength; i++) {
            candidate.setIndex(i);
            candidate.setValue(array[i]);

            log.debug(String.format("Array[i] = %s",array[i]));
            log.debug(String.format("Buy = %d", candidate.getValue()));

            /* Shorten list for 1 element from the very beginning.*/
            arrayAsList.removeFirst();

            /* Get out of the cycle after emptying the list*/
            if (arrayAsList.isEmpty()){
                break;
            }

            /* Find the max element!*/
            int j = arrayAsList.indexOf(Collections.max(arrayAsList));
            candidate.setMaxForThisValue(arrayAsList.get(j));
            candidate.setMaxForThisIndex(j + i + 1);
            candidate.setProfit(candidate.getMaxForThisValue() - candidate.getValue());

            /* Select what is greater and set it to the result entity*/
            if (result.getProfit() <= candidate.getProfit()){
                result = (Result) candidate.clone();
                candidate.reset();
            }
        }

        return result;
    }
}
