package info.sjd.controller;

import info.sjd.service.Service;
import info.sjd.service.Timer;

import java.util.Arrays;

public class Controller {
    private int[] a;
    private long startTime;
    private long endTime;
    private boolean showTimings = false;

    public Controller() {
    }

    public Controller(boolean showTimings) {
        this.showTimings = showTimings;
    }

    public Controller(int[] a) {
        this.a = a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void start() {
        System.out.println("Array is " + Arrays.toString(a));
        System.out.println("************************************************");

        startTime = System.nanoTime();

        Service service = new Service();
        service.getProfit(a);

        endTime = System.nanoTime();


        if (service.getResultIsFound()) {
            System.out.println("************************************************");
            System.out.println(String.format("Max profit is %d", service.getProfit()));
            System.out.println("************************************************");
        } else {
            System.out.println("Profit is not found.");
        }

        if (showTimings) Timer.elapsed(startTime, endTime);
    }
}

