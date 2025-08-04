import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int groupWordCount = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }
        System.out.println(groupWordCount);
    }

    private static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];
        char prevChar = word.charAt(0);
        visited[prevChar - 'a'] = true;

        for (int i = 1; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (currentChar != prevChar) {
                if (visited[currentChar - 'a']) {
                    return false;
                }
                visited[currentChar - 'a'] = true;
            }
            prevChar = currentChar;
        }
        return true;
    }
}