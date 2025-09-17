import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (a == 0) break;

            int b = 1;
            for (int i = 0; i < a; i++) {
                int s = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                b = b * s - c;
            }
            System.out.println(b);
        }
    }
}