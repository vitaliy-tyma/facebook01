package info.sjd.controlller;

import info.sjd.service.Service;
import info.sjd.service.Timer;

import java.util.Arrays;

public class Controller {
    private int[] a;
    private long startTime;
    private long endTime;

    public Controller(int[] a) {
        this.a = a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void start() {
        startTime = System.nanoTime();

        Service service = new Service();
        service.getProfit(a);

        endTime = System.nanoTime();
        Timer.elapsed(startTime, endTime);

        System.out.println("Array is " + Arrays.toString(a));
        if (service.getResultIsFound()) {
            System.out.println(String.format("Profit is %d", service.getProfit()));
        } else {
            System.out.println("Profit is not found.");
        }
    }
}

