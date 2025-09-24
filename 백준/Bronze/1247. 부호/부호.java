import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 0; t < 3; t++) {
            int n = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;

            for (int i = 0; i < n; i++) {
                sum = sum.add(new BigInteger(br.readLine()));
            }

            int s = sum.signum();
            if (s == 0) System.out.println("0");
            else if (s > 0) System.out.println("+");
            else System.out.println("-");
        }
    }
}