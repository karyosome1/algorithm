import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int width = 2 * n - 1;

        for (int r = 1; r <= width; r++) {
            int dist = Math.abs(n - r);
            int stars = 2 * dist + 1;
            int spaces = (width - stars) / 2;

            System.out.print(" ".repeat(spaces));
            System.out.println("*".repeat(stars));
        }
    }
}
