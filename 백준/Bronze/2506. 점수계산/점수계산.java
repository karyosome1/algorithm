import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int score = 0;

        for (int i = 0; i < n; i++) {
            int isCorrect = sc.nextInt();
            if (isCorrect == 1) {
                score += ++count;
            } else {
                count = 0;
            }
        }
        System.out.print(score);
    }
}