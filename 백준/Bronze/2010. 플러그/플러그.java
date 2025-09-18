import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(br.readLine());
        }
        int answer = sum - (n - 1);
        System.out.println(answer);
    }
}