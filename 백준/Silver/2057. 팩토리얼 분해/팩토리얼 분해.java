import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        System.out.println(n != 0 && isPossible(n) ? "YES" : "NO");
    }

    private static boolean isPossible(long n) {
        long fact = 2432902008176640000L;

        for (int i = 20; i > 0; i--) {
            fact /= i;
            if (n >= fact) {
                n -= fact;
            }
        }
        return n == 0;
    }
}