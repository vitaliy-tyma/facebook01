package info.sjd.util;

public class Timer {

    public static String elapsed(long startTime, long endTime) {
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.

        int nanoseconds = (int) (duration) % 60;
        int milliseconds = (int) (duration / 1_000_000L) % 60;
        int seconds = (int) (duration / 1_000_000_000L) % 60;
        int minutes = (int) ((duration / (1_000_000_000L * 60)) % 60);

        double elapsedTimeInSecond = (double) duration / 1_000_000_000L;

        return String.format("Elapsed - %f sec - " +
                                "%d min, " +
                                "%d sec, " +
                                "%d millisec, " +
                                "%d nanosec",
                elapsedTimeInSecond,
                minutes, seconds, milliseconds, nanoseconds);

    }
}
