import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line == null) break;
            if (line.equals("#")) break;

            line = line.toUpperCase();
            int count = 0;

            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}