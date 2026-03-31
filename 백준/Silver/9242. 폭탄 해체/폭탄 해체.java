import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static final String[] DIGITS = {
        "***" + "* *" + "* *" + "* *" + "***", // 0
        "  *" + "  *" + "  *" + "  *" + "  *", // 1
        "***" + "  *" + "***" + "*  " + "***", // 2
        "***" + "  *" + "***" + "  *" + "***", // 3
        "* *" + "* *" + "***" + "  *" + "  *", // 4
        "***" + "*  " + "***" + "  *" + "***", // 5
        "***" + "*  " + "***" + "* *" + "***", // 6
        "***" + "  *" + "  *" + "  *" + "  *", // 7
        "***" + "* *" + "***" + "* *" + "***", // 8
        "***" + "* *" + "***" + "  *" + "***"  // 9
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] lines = new String[5];
        for (int i = 0; i < 5; i++) lines[i] = br.readLine();

        int len = lines[0].length();
        int digitCount = (len + 1) / 4;
        int value = 0;

        for (int c = 0; c < digitCount; c++) {
            StringBuilder cur = new StringBuilder();
            int start = c * 4;

            for (int r = 0; r < 5; r++) {
                cur.append(lines[r], start, start + 3);
            }

            int d = findDigit(cur.toString());
            if (d == -1) {
                System.out.println("BOOM!!");
                return;
            }

            value = value * 10 + d;
        }

        System.out.println(value % 6 == 0 ? "BEER!!" : "BOOM!!");
    }

    static int findDigit(String s) {
        for (int i = 0; i < 10; i++) {
            if (DIGITS[i].equals(s)) return i;
        }
        return -1;
    }
}