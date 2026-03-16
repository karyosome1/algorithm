import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxLength = 0;
        String maxWord = "";

        while (true) {

            String line = br.readLine();

            if (line.contains("E-N-D")) break;

            String[] input = line.split(" ");

            for (int i = 0; i < input.length; i++) {

                String now = input[i].replaceAll("[^a-zA-Z-]", "");

                int count = now.length();

                if (count > maxLength) {
                    maxLength = count;
                    maxWord = now;
                }
            }
        }

        System.out.println(maxWord.toLowerCase());
    }
}