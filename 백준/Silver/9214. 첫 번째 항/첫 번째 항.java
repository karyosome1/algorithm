import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = 1;

        while (true) {
            String n = br.readLine();
            if (n == null || n.equals("0")) break;

            String current = n;

            while (true) {
                if (current.length() % 2 != 0) break;

                StringBuilder prevCandidate = new StringBuilder();
                try {
                    for (int i = 0; i < current.length(); i += 2) {
                        int count = current.charAt(i) - '0';
                        char value = current.charAt(i + 1);
                        for (int j = 0; j < count; j++) {
                            prevCandidate.append(value);
                        }
                    }
                } catch (Exception e) { break; }

                String candidateStr = prevCandidate.toString();

                if (candidateStr.equals(current)) break;

                if (getNextAntString(candidateStr).equals(current)) {
                    current = candidateStr;
                } else {
                    break;
                }
            }

            System.out.println("Test " + testCase++ + ": " + current);
        }
    }

    private static String getNextAntString(String s) {
        if (s.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char target = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                count++;
            } else {
                sb.append(count).append(target);
                target = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(target);
        return sb.toString();
    }
}
