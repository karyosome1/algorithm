import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plain = sc.nextLine();
        String key = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int m = key.length();

        for (int i = 0; i < plain.length(); i++) {
            char pc = plain.charAt(i);
            char kc = key.charAt(i % m);

            if (pc == ' ') {
                sb.append(' ');
                continue;
            }

            int p0 = pc - 'a';
            int k1 = (kc - 'a') + 1;
            int c0 = (p0 - k1 + 26) % 26;
            sb.append((char) (c0 + 'a'));
        }
        System.out.println(sb);
    }
}