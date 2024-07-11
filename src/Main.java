import java.time.Duration;
import java.time.LocalTime;

public class Main {
    private static void timeIsGreat(LocalTime time, Duration duration) {
        System.out.println(time.plus(duration).isAfter(LocalTime.now()));
    }
    public static void main(String[] args) {
        return;
    }
}