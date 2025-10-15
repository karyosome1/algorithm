import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 101;
        boolean hasOdd = false;

        for (int i = 0; i < 7; i++) {
            int x = sc.nextInt();
            if (x % 2 == 1) {
                hasOdd = true;
                sum += x;
                if (x < min) min = x;
            }
        }

        if (!hasOdd) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
