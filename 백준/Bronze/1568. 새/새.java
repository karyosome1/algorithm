import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        int count = 0;

        while (n > 0) {
            if (n < k)
                k = 1;
            n -= k;
            count++;
            k++;
        }
        System.out.println(count);
    }
}