import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 나머지 값의 중복 제거를 위한 Set
        HashSet<Integer> remainders = new HashSet<>();

        // 입력 10개 받고, 42로 나눈 나머지를 Set에 추가
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            remainders.add(num % 42);
        }

        // 서로 다른 나머지의 개수 출력
        System.out.println(remainders.size());
    }
}