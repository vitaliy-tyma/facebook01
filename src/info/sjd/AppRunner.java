package info.sjd;

import info.sjd.controller.*;
import info.sjd.service.Timer;

/**
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


        int[] a0 = {1, 2, 3, 4};
        int[] a1 = {9,10,11,12};
        int[] a2 = {9,10,5,44,6,44,2,8,2};
        int[] a3 = {2,2,2,4};

        Controller c = new Controller(true);

//        c.setA(a0);
//        c.start();
//
//        c.setA(a1);
//        c.start();

        c.setA(a2);
        c.start();

//        c.setA(a3);
//        c.start();

    }


}