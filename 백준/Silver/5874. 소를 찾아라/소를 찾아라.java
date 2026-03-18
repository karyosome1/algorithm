import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int leftPairCount = 0; 
        int answer = 0;

        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i) == line.charAt(i - 1)) {
                if (line.charAt(i) == '(') {
                    leftPairCount++;
                } else {
                    answer += leftPairCount;
                }
            }
        }

        System.out.println(answer);
    }
}