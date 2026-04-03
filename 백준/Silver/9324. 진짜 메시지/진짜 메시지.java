import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int testCaseCount = Integer.parseInt(br.readLine());

        while (testCaseCount-- > 0) {
            String message = br.readLine();
            answer.append(isFake(message) ? "FAKE" : "OK").append('\n');
        }

        System.out.print(answer);
    }

    private static boolean isFake(String message) {
        int[] count = new int[26];
        int length = message.length();

        for (int i = 0; i < length; i++) {
            char current = message.charAt(i);
            int index = current - 'A';

            count[index]++;

            if (count[index] == 3) {
                if (i + 1 >= length || message.charAt(i + 1) != current) {
                    return true;
                }

                count[index] = 0;
                i++;
            }
        }

        return false;
    }
}