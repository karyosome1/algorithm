import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int firstRadius = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            int currentRadius = Integer.parseInt(st.nextToken());
            int gcdValue = gcd(firstRadius, currentRadius);

            int numerator = firstRadius / gcdValue;
            int denominator = currentRadius / gcdValue;

            System.out.println(numerator + "/" + denominator);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}