import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        long[] timeValues = {
                10000L,
                100000L,
                1000000L,
                10000000L,
                100000000L,
                1000000000L,
                10000000000L,
                100000000000L
        };

        for (long timeValue : timeValues) {
            Date date = new Date(timeValue);

            System.out.println("Time value: " + timeValue + " -> " + date.toString());
        }
    }
}