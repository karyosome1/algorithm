import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<Integer> dq = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            dq.addLast(i);
        }

        StringBuilder sb = new StringBuilder();

        while (dq.size() > 1) {
            sb.append(dq.pollFirst()).append(" ");
            dq.addLast(dq.pollFirst());
        }
        sb.append(dq.pollFirst());
        System.out.println(sb);
    }
}
