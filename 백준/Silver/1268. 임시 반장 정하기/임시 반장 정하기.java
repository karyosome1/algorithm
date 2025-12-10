import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] student_classes = new int[num][5];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++) {
                student_classes[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int leader = 0;
        for (int i = 0; i < num; i++) {
            int cnt = 0;
            for (int k = 0; k < num; k++) {
                if (i == k) {
                    continue;
                }
                for (int j = 0; j < 5; j++) {
                    if (student_classes[i][j] == student_classes[k][j]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                leader = i;
                max = cnt;
            }
        }
        System.out.println(leader + 1);
    }
}