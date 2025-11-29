import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long s = sc.nextLong();
        long plus = 1;
        long sum = 0;

        while (sum + plus <= s) {
            sum += plus;
            plus++;
        }
        System.out.println(plus - 1);
    }
}