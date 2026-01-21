import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] tip = new int[n];

        for (int i = 0; i < n; i++) {
            tip[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(tip);

        long sum = 0L;
        for (int i = n - 1; i >= 0; i--) {
            int discount = (n - 1) - i;
            int earned = tip[i] - discount;

            if (earned <= 0) {
                break;
            }
            sum += earned;
        }

        System.out.println(sum);
    }
}