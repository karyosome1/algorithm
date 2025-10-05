import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < n; i++) sumA += sc.nextInt();
        for (int i = 0; i < m; i++) sumB += sc.nextInt();

        System.out.println(sumA - sumB);
    }
}