import java.util.Scanner;

public class Main {
    private static final int SIZE = 6;

    private static class Point {
        private final int x;
        private final int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] visited = new boolean[SIZE][SIZE];

        Point start = parse(sc.nextLine());
        visited[start.x][start.y] = true;

        Point prev = start;
        Point last = start;

        boolean valid = true;

        for (int i = 1; i < SIZE * SIZE; i++) {
            Point next = parse(sc.nextLine());

            if (visited[next.x][next.y] || !isKnightMove(prev, next)) {
                valid = false;
                break;
            }

            visited[next.x][next.y] = true;
            prev = next;
            last = next;
        }

        if (valid && !isKnightMove(last, start)) {
            valid = false;
        }

        System.out.println(valid ? "Valid" : "Invalid");
    }

    private static Point parse(String s) {
        int x = s.charAt(0) - 'A';
        int y = s.charAt(1) - '1';
        return new Point(x, y);
    }

    private static boolean isKnightMove(Point a, Point b) {
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
