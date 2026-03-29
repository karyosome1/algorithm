import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String ps = br.readLine();
            bw.write(isVPS(ps) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static String isVPS(String ps) {
        int count = 0;

        for (char c : ps.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count == 0) {
                    return "NO";
                }
                count--;
            }
        }

        return (count == 0) ? "YES" : "NO";
    }
}
