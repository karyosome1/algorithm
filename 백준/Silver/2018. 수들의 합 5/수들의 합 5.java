import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int left = 1;
        int right = 1;
        int sum = 1;
        int count = 0;

        while (right <= n) {
            if (sum == n) {
                count++;
                right++;
                sum += right;
            } else if (sum > n) {
                sum -= left;
                left++;
            } else {
                right++;
                sum += right;
            }
        }
        System.out.println(count);
    }
}