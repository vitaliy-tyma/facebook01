package info.sjd.util;

public class Timer {

    public static String elapsed(long startTime, long endTime) {
        long duration = (endTime - startTime);  //divide by 1_000_000L to get milliseconds.


        double elapsedTimeInSecond = (double) duration / 1_000_000_000L;

        return String.format("Elapsed %f sec",
                elapsedTimeInSecond);

    }
}
