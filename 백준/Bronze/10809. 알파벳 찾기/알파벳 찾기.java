import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] positions = new int[26];
        for (int i = 0; i < 26; i++) {
            positions[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';

            if (positions[idx] == -1) {
                positions[idx] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int pos : positions) {
            sb.append(pos).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}