import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();

        int maxLength = 0;
        List<Integer> maxSequence = new ArrayList<>();
        
        for (int second = 1; second <= first; second++) {
            List<Integer> currentSequence = new ArrayList<>();
            int prev = first;
            int curr = second;

            currentSequence.add(prev);
            currentSequence.add(curr);

            while (true) {
                int next = prev - curr;
                if (next < 0) {
                    break;
                }
                currentSequence.add(next);
                prev = curr;
                curr = next;
            }

            if (currentSequence.size() > maxLength) {
                maxLength = currentSequence.size();
                maxSequence = currentSequence;
            }
        }

        System.out.println(maxLength);
        for (int i = 0; i < maxSequence.size(); i++) {
            System.out.print(maxSequence.get(i));
            if (i < maxSequence.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}