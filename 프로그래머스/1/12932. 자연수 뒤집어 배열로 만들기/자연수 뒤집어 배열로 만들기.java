import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(long n) {
        List<Integer> answer = new ArrayList<>(); // 정수형 동적 리스트 생성 및 초기화
        while (n > 0) {
            answer.add((int) (n % 10)); // n의 가장 마지막 자리 숫자
            n /= 10;                    // n의 마지막 자리 숫자를 제거
        }
        return answer;
    }
}