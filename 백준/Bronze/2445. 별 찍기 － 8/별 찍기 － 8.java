import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i <= n) ? i : (2 * n - i);
            int spaces = 2 * (n - stars);

            sb.append("*".repeat(stars))
              .append(" ".repeat(spaces))
              .append("*".repeat(stars))
              .append('\n');
        }
        System.out.print(sb);
    }
}