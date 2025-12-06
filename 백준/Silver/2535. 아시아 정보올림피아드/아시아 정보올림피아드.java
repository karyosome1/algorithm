import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] students = new int[n][3];

        int maxCountry = 0;
        for (int i = 0; i < n; i++) {
            int country = sc.nextInt();
            int student = sc.nextInt();
            int score = sc.nextInt();

            students[i][0] = country;
            students[i][1] = student;
            students[i][2] = score;

            if (country > maxCountry) {
                maxCountry = country;
            }
        }

        Arrays.sort(students, (a, b) -> b[2] - a[2]);
        int[] count = new int[maxCountry + 1];

        int picked = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int country = students[i][0];

            if (count[country] == 2) {
                continue;
            }

            sb.append(country)
              .append(" ")
              .append(students[i][1])
              .append("\n");

            count[country]++;
            picked++;

            if (picked == 3) {
                break;
            }
        }

        System.out.print(sb);
    }
}