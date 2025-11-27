import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        char[][] room = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            room[i] = line.toCharArray();
        }

        int rowCount = 0;
        int colCount = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (room[i][j] == '.') {
                    cnt++;
                }
                if (room[i][j] == 'X' || j == n - 1) {
                    if (cnt >= 2) rowCount++;
                    cnt = 0;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (room[i][j] == '.') {
                    cnt++;
                }
                if (room[i][j] == 'X' || i == n - 1) {
                    if (cnt >= 2) colCount++;
                    cnt = 0;
                }
            }
        }
        System.out.println(rowCount + " " + colCount);
    }
}