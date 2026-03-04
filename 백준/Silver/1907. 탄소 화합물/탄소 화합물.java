import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "+=");

        int[][] molecules = {
            count(st.nextToken()),
            count(st.nextToken()),
            count(st.nextToken())
        };
        System.out.println(search(molecules));
    }

    private static String search(int[][] m) {
        for (int x1 = 1; x1 <= 10; x1++) {
            for (int x2 = 1; x2 <= 10; x2++) {
                for (int x3 = 1; x3 <= 10; x3++) {
                    if (isBalanced(m, x1, x2, x3)) {
                        return x1 + " " + x2 + " " + x3;
                    }
                }
            }
        }
        return "";
    }

    private static int[] count(String s) {
        int[] atoms = new int[3];

        for (int i = 0; i < s.length(); i++) {
            int index = (s.charAt(i) == 'C') ? 0 :
                (s.charAt(i) == 'H') ? 1 : 2;

            int value = 1;
            if (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                value = s.charAt(++i) - '0';
            }
            atoms[index] += value;
        }
        return atoms;
    }

    private static boolean isBalanced(int[][] m, int x1, int x2, int x3) {
        for (int atom = 0; atom < 3; atom++) {
            int left = m[0][atom] * x1 + m[1][atom] * x2;
            int right = m[2][atom] * x3;

            if (left != right) {
                return false;
            }
        }
        return true;
    }
}