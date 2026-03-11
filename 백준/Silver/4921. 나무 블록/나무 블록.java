import java.io.*;

public class Main {

    static char[][][] rule = new char[9][][];

    static {
        rule[3] = new char[][]{{'4','4'}, {'4','5'}, {'6','4'}, {'6','5'}};
        rule[4] = new char[][]{{'1','2'}, {'1','3'}, {'3','2'}, {'3','3'}};
        rule[5] = new char[][]{{'1','8'}, {'3','8'}};
        rule[6] = new char[][]{{'8','2'}, {'8','3'}};
        rule[7] = new char[][]{{'8','8'}};
        rule[8] = new char[][]{{'5','6'}, {'5','7'}, {'7','6'}, {'7','7'}};
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int tc = 1;

        while (!(s = br.readLine()).equals("0")) {

            boolean valid = isValid(s);

            System.out.println(tc++ + ". " + (valid ? "VALID" : "NOT"));
        }
    }

    static boolean isValid(String s) {

        int n = s.length();

        if (s.charAt(0) != '1' || s.charAt(n - 1) != '2')
            return false;

        int c1 = 0, c2 = 0, c5 = 0, c6 = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '1') c1++;
            if (c == '2') c2++;
            if (c == '5') c5++;
            if (c == '6') c6++;
        }

        if (c1 != c2 || c5 != c6)
            return false;

        for (int i = 1; i < n - 1; i++) {

            char key = s.charAt(i);
            char prev = s.charAt(i - 1);
            char next = s.charAt(i + 1);

            char[][] pairs = rule[key - '0'];

            if (pairs == null)
                return false;

            boolean ok = false;

            for (char[] p : pairs) {
                if (p[0] == prev && p[1] == next) {
                    ok = true;
                    break;
                }
            }

            if (!ok)
                return false;
        }

        return true;
    }
}