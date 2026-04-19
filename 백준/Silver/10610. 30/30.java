import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        char[] digits = n.toCharArray();
        Arrays.sort(digits);

        int sum = 0;
        boolean hasZero = false;

        for (char c : digits) {
            int num = c - '0';
            sum += num;
            if (c == '0') {
                hasZero = true;
            }
        }

        if (!hasZero || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) {
            sb.append(digits[i]);
        }

        System.out.println(sb.toString());
    }
}
