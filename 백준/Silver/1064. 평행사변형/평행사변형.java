import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());

        if (ccw(x1, y1, x2, y2, x3, y3) == 0) {
            System.out.println(-1.0);
            return;
        }

        double[] dist = new double[3];
        dist[0] = distance(x1, y1, x2, y2);
        dist[1] = distance(x2, y2, x3, y3);
        dist[2] = distance(x3, y3, x1, y1);

        Arrays.sort(dist);

        double answer = (dist[2] - dist[0]) * 2;

        System.out.printf("%.15f\n", answer);
    }

    private static long ccw(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (long)(x2 - x1) * (y3 - y1)
            - (long)(y2 - y1) * (x3 - x1);
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        long dx = x1 - x2;
        long dy = y1 - y2;
        return Math.sqrt(dx * dx + dy * dy);
    }
}