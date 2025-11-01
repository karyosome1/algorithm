import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        double min = (double) x / y;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int xi = sc.nextInt();
            int yi = sc.nextInt();
            min = Math.min(min, (double) xi / yi);
        }

        double answer = min * 1000.0;
        System.out.printf("%.2f\n", answer);
    }
}