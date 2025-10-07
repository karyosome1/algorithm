import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i == j || j == k || i == k) continue;
                    boolean hourValid = (1 <= arr[i] && arr[i] <= 12);
                    boolean minuteValid = (0 <= arr[j] && arr[j] <= 59);
                    boolean secondValid = (0 <= arr[k] && arr[k] <= 59);
                    if (hourValid && minuteValid && secondValid) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}