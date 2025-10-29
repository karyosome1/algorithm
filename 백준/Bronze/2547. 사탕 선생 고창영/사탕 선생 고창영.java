import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            BigInteger sum = BigInteger.ZERO;

            for (int j = 0; j < n; j++) {
                sum = sum.add(sc.nextBigInteger());
            }

            if (sum.mod(BigInteger.valueOf(n)).equals(BigInteger.ZERO)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}