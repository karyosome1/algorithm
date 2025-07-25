import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(getDialTime(input));
    }

    public static int getDialTime(String word) {
        String[] dial = {
            "",
            "",
            "ABC",  // 2 ->  3초
            "DEF",  // 3 ->  4초
            "GHI",  // 4 ->  5초
            "JKL",  // 5 ->  6초
            "MNO",  // 6 ->  7초
            "PQRS", // 7 ->  8초
            "TUV",  // 8 ->  9초
            "WXYZ"  // 9 -> 10초
        };

        int total = 0;

        for (char c : word.toCharArray()) {
            for (int i = 2; i < dial.length; i++) {
                if (dial[i].indexOf(c) != -1) {
                    total += i + 1;
                    break;
                }
            }
        }
        return total;
    }
}