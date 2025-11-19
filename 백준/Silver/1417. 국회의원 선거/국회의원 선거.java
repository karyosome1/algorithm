import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dasom = sc.nextInt();

        if (n == 1) {
            System.out.println(0);
            return;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n - 1; i++) {
            pq.add(sc.nextInt());
        }

        int count = 0;

        while (!pq.isEmpty() && pq.peek() >= dasom) {
            int top = pq.poll();
            top--;
            dasom++;
            count++;
            pq.add(top);
        }

        System.out.println(count);
    }
}