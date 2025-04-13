public class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10; // n을 10으로 나눈 나머지 (마지막 자릿수)를 더함
            n /= 10;          // n을 10으로 나눈 몫 (마지막 자릿수 제거)으로 업데이트
        }
        return answer;
    }
}