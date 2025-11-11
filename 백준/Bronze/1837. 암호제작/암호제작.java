import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger P = new BigInteger(sc.next());
        int K = sc.nextInt();

        if (K > 2 && P.mod(BigInteger.valueOf(2)).signum() == 0) {
            System.out.println("BAD 2");
            return;
        }

        for (int i = 3; i < K; i += 2) {
            if (P.mod(BigInteger.valueOf(i)).signum() == 0) {
                System.out.println("BAD " + i);
                return;
            }
        }
        System.out.println("GOOD");
    }
}