import java.io.*;
import java.util.*;

public class Main {
    private static final char[] DIGITS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        do {
            int rem = n % b;
            sb.append(DIGITS[rem]);
            n /= b;
        } while (n > 0);

        System.out.println(sb.reverse());
    }
}