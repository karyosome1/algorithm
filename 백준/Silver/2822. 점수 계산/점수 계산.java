import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    static class Problem {
        int index;
        int score;

        Problem(int index, int score) {
            this.index = index;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Problem[] list = new Problem[8];
        for (int i = 1; i <= 8; i++) {
            list[i - 1] = new Problem(i, sc.nextInt());
        }

        Arrays.sort(list, new Comparator<Problem>() {
            @Override
            public int compare(Problem a, Problem b) {
                return Integer.compare(b.score, a.score);
            }
        });

        int total = 0;
        int[] chosen = new int[5];

        for (int i = 0; i < 5; i++) {
            total += list[i].score;
            chosen[i] = list[i].index;
        }

        Arrays.sort(chosen);

        System.out.println(total);

        for (int i = 0; i < 5; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(chosen[i]);
        }
        System.out.println();
    }
}