import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long total = 0;
        long start = 1;
        int digit = 1;

        while (start <= n) {
            long end = Math.min(n, start * 10 - 1);
            long count = end - start + 1;
            total += count * digit;

            start *= 10;
            digit++;
        }

        System.out.println(total);
    }
}