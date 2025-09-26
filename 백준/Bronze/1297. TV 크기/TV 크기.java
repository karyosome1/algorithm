import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int d = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        double diagonal = Math.sqrt((long) h * h + (long) w * w);
        double scale = d / diagonal;

        int height = (int) (h * scale);
        int width = (int) (w * scale);

        System.out.println(height + " " + width);
    }
}
