import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX = 100;
        boolean[][] map = new boolean[MAX + 1][MAX + 1];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    map[y][x] = true;
                }
            }
        }

        int area = 0;
        for (int y = 1; y <= MAX; y++) {
            for (int x = 1; x <= MAX; x++) {
                if (map[y][x]) {
                    area++;
                }
            }
        }
        
        System.out.println(area);
    }
}
