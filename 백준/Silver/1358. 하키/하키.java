import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static boolean inCircle(int px, int py, int cx, int cy, int r) {
        long dx = (long) px - cx;
        long dy = (long) py - cy;
        long r2 = (long) r * r;
        return dx * dx + dy * dy <= r2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int r = h / 2;
        int leftCx = x;
        int rightCx = x + w;
        int cy = y + r;

        int cnt = 0;

        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            int px = Integer.parseInt(st.nextToken());
            int py = Integer.parseInt(st.nextToken());

            boolean inRect = (x <= px && px <= x + w && y <= py && py <= y + h);
            boolean inLeft = inCircle(px, py, leftCx, cy, r);
            boolean inRight = inCircle(px, py, rightCx, cy, r);

            if (inRect || inLeft || inRight) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
