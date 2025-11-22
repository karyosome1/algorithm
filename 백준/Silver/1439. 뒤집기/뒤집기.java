import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int zeroCount = 0;
        int oneCount = 0;

        if (s.charAt(0) == '0') {
            zeroCount++;
        } else {
            oneCount++;
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                if (s.charAt(i) == '0') {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }
        }
        System.out.println(Math.min(zeroCount, oneCount));
    }
}