import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int reversedA = reverseAndParse(input[0]);
        int reversedB = reverseAndParse(input[1]);

        System.out.println(Math.max(reversedA, reversedB));
    }

    private static int reverseAndParse(String numStr) {
        return Integer.parseInt(new StringBuilder(numStr).reverse().toString());
    }
}