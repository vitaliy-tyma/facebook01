package info.sjd;

import info.sjd.controller.*;
import info.sjd.util.RandomArray;

/** @author VTyma
 * This problem was asked by Facebook.
 * <p>
 * Given a array of numbers representing the stock prices of a company in chronological order,
 * write a function that calculates the maximum profit you could have made from buying
 * and selling that stock once. You must buy before you can sell it.
 * <p>
 * For example, given [9, 11, 8, 5, 7, 10],
 * you should return 5, since you could buy the stock
 * at 5 dollars and sell it at 10 dollars.
 *
 */

public class AppRunner {
    public static void main(String[] args) {
        final boolean SHOW_TIMINGS = true;
        final int LENGTH = 500;
        final int LIMIT = 1000001;



        int[] a0 = {1, 2, 3, 4};
        int[] a1 = {9,10,11,12};
        int[] a2 = {9,10,5,44,6,44,2,8,2};
        int[] a3 = {9};
        int[] a4 = {2,2,2,4};

        int[] a5 = RandomArray.getRandomArray(LENGTH, LIMIT);




        Controller.start(a5, SHOW_TIMINGS);



    }


}
