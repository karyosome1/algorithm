import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] file = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            file[i] = Integer.parseInt(st.nextToken());
        }

        int cluster = Integer.parseInt(br.readLine());
        long totalBytes = 0;

        for (int i = 0; i < n; i++) {
            int size = file[i];
            if (size == 0) continue;
            int clusters = (size + cluster - 1) / cluster;
            totalBytes += (long) clusters * cluster;
        }
        System.out.println(totalBytes);
    }
}