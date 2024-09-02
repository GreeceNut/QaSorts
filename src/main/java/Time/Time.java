package Time;

import java.time.Duration;

public class Time {
    public static int Past(int h, int m, int s) {
        return (int) Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
    }
}
