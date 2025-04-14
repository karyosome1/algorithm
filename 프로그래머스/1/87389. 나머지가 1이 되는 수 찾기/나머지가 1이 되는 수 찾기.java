class Solution {
    public int solution(int n) {
        int answer = 1;
        while (true) {
            if (n % answer == 1) { // n을 answer로 나눈 나머지가 1이면 반복문 빠져나옴
                break;
            }
            answer++; // n을 answer로 나눈 나머지가 1이 아니면 answer 증가
        }
        return answer;
    }
}