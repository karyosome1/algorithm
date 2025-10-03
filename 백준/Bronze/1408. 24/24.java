import java.io.*;
import java.time.LocalTime;

public class Main {
    private static final int DAY_SEC = 24 * 3600;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int now = LocalTime.parse(br.readLine()).toSecondOfDay();
        int start = LocalTime.parse(br.readLine()).toSecondOfDay();

        int delta = (start - now + DAY_SEC) % DAY_SEC;

        int h = delta / 3600, m = (delta % 3600) / 60, s = delta % 60;
        System.out.printf("%02d:%02d:%02d", h, m, s);
    }
}