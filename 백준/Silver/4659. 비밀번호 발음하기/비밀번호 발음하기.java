import java.io.*;

public class Main {
    private static final String V = "aeiou";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s.equals("end")) {
                break;
            }

            boolean hasV = false;
            boolean bad = false;

            int vCnt = 0;
            int cCnt = 0;

            for (int i = 0; i < s.length(); i++) {
                char cur = s.charAt(i);

                if (isV(cur)) {
                    hasV = true;
                    vCnt++;
                    cCnt = 0;
                } else {
                    cCnt++;
                    vCnt = 0;
                }

                if (vCnt >= 3 || cCnt >= 3) {
                    bad = true;
                    break;
                }

                if (i > 0) {
                    char prev = s.charAt(i - 1);
                    if (prev == cur && cur != 'e' && cur != 'o') {
                        bad = true;
                        break;
                    }
                }
            }

            boolean ok = hasV && !bad;

            StringBuilder sb = new StringBuilder();
            sb.append("<").append(s).append("> is ");
            if (!ok) {
                sb.append("not ");
            }
            sb.append("acceptable.");
            System.out.println(sb);
        }
    }

    private static boolean isV(char c) {
        return V.indexOf(c) >= 0;
    }
}