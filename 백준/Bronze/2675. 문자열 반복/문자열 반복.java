import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            String s = input[1];

            for (char c : s.toCharArray()) {
                sb.append(String.valueOf(c).repeat(r));
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}