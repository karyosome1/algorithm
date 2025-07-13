import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] submitted = new boolean[31]; // 인덱스 1~30 사용

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 28명의 제출자 번호 입력받가
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            submitted[n] = true; // 제출한 번호 체크
        }

        // 제출 안 한 사람 번호 출력
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                System.out.println(i);
            }
        }
    }
}