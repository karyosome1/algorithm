import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int ASCII_ZERO = '0';

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] digits = br.readLine().toCharArray();

        int sum = 0;
        for (char digit : digits) {
            sum += digit - ASCII_ZERO;
        }

        System.out.println(sum);
    }
}