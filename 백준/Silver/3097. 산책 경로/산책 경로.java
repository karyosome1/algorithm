import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        int totalX = 0;
        int totalY = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); 
            arr[i][1] = Integer.parseInt(st.nextToken()); 

            totalX += arr[i][0];
            totalY += arr[i][1];
        }

        System.out.println(totalX + " " + totalY);
        double min = Double.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int x = totalX - arr[i][0];
            int y = totalY - arr[i][1];

            double dist = Math.sqrt(x * x + y * y);
            min = Math.min(min, dist);
        }
        System.out.printf("%.2f\n", min);
    }
}