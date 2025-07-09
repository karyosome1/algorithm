import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;   // 최댓값
        int index = 0; // 최댓값의 위치 (1-based)

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                index = i + 1; // 1-based index
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}