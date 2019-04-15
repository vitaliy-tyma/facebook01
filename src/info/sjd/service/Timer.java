package info.sjd.service;

public class Timer {

    public static void elapsed(long startTime, long endTime) {
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.

        int nanoseconds = (int) (duration) % 60;
        int milliseconds = (int) (duration / 1000000) % 60;
        int seconds = (int) (duration / 1000000000) % 60;
        //int minutes = (int) ((duration / (1000000000 * 60)) % 60); //Overflow!!!!????
        //int hours = (int) ((duration / (1000000000 * 60 * 60)) % 24);

        System.out.println(
                String.format("Elapsed - %d min (not operate - always 0), %d sec, %d millisec, %d nanosec",
                0, seconds, milliseconds, nanoseconds
                ));

    }
}
