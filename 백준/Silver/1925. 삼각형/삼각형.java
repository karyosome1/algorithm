import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long x1 = Long.parseLong(st.nextToken());
        long y1 = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long x2 = Long.parseLong(st.nextToken());
        long y2 = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long x3 = Long.parseLong(st.nextToken());
        long y3 = Long.parseLong(st.nextToken());

        long cross = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
        if (cross == 0) {
            System.out.println("X");
            return;
        }

        long a = dist2(x1, y1, x2, y2);
        long b = dist2(x2, y2, x3, y3);
        long c = dist2(x3, y3, x1, y1);

        long[] d = {a, b, c};
        Arrays.sort(d);

        boolean isEquilateral = (d[0] == d[1] && d[1] == d[2]);
        boolean isIsosceles = (d[0] == d[1] || d[1] == d[2]);

        long sumSmall = d[0] + d[1];
        long max = d[2];

        String angleType;
        if (sumSmall == max) angleType = "Jikkak";
        else if (sumSmall < max)  angleType = "Dunkak";
        else angleType = "Yeahkak";

        if (isEquilateral) {
            System.out.println("JungTriangle");
        } else if (isIsosceles) {
            System.out.println(angleType + "2Triangle");
        } else {
            System.out.println(angleType + "Triangle");
        }
    }

    static long dist2(long x1, long y1, long x2, long y2) {
        long dx = x1 - x2;
        long dy = y1 - y2;
        return dx * dx + dy * dy;
    }
}