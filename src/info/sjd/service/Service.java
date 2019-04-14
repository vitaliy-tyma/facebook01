package info.sjd.service;

import java.util.Random;

public class Service {

    private boolean resultIsFound = false;
    private int profit = 0;
    private int buy;
    private int sell;
    //public int[] array;


    private int[] setRandomArray(int length, int limit){

        int[] a = new int[length];

        Random random = new Random();
        for (int i = 0; i < length; i++){
            a[i] = random.nextInt(limit);
        }
        return a;
    }

    public boolean getResultIsFound() {
        return resultIsFound;
    }

    public int getProfit() {
        return profit;
    }



    public void getProfit(int[] a){

        if (a.length < 2) return;

        buy = a[0];

        for (int i = 1; i < a.length; i++){

            if (buy <= a[i]){
                if (profit < a[i] - buy) {
                    sell = a[i];
//                    System.out.print("Sell = a[i] " + a[i]);
                }
            } else {
                if (profit < sell - a[i]) {
                    buy = a[i];
//                    System.out.print("Buy = a[i] " + a[i]);
                }
            }
            resultIsFound = true;
            profit = sell - buy;
//            System.out.println(String.format(". Profit (%d - %d) = %d", sell, buy, profit));
        }


        //return;

    }
}
