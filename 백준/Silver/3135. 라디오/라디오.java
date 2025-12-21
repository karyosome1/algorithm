import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int minPress = Math.abs(b - a);

        for (int i = 0; i < n; i++) {
            int favorite = sc.nextInt();

            if (favorite == b) {
                System.out.println(1);
                return;
            }

            int cost = 1 + Math.abs(b - favorite);
            minPress = Math.min(minPress, cost);
        }
        System.out.println(minPress);
    }
}