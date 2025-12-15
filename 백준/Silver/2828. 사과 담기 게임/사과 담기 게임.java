import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int j = sc.nextInt();

        int result = 0;
        int left = 1;
        int right = left + m - 1;

        for (int i = 0; i < j; i++) {
            int drop = sc.nextInt();

            if (drop < left) {
                int move = left - drop;
                result += move;
                left -= move;
                right -= move;
            } else if (drop > right) {
                int move = drop - right;
                result += move;
                left += move;
                right += move;
            }
        }
        System.out.print(result);
    }
}