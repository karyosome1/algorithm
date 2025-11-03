import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int team = Math.min(n/2, m);
        while ((n + m - k) < team * 3) {
            team -= 1;
        }
        System.out.print(team);
    }
}