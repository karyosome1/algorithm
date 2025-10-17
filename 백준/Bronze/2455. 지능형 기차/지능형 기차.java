import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max = 0;

        for (int i = 0; i < 4; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();
            sum += in - out;
            max = Math.max(max, sum);
        }
        System.out.print(max);
    }
}
