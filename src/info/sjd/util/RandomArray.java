package info.sjd.util;

import java.util.Random;

public class RandomArray {

    public int[] getRandomArray(int length, int limit) {
        int[] a = new int[length];

        Random random = new Random();
        for (int i = 0; i < length; i++){
            a[i] = random.nextInt(limit);
        }
        return a;
    }

}
