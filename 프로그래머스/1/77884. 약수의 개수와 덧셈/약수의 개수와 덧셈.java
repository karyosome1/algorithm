class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            // 제곱근이 정수이면 완전제곱수 (약수의 개수가 홀수)
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        return answer;
    }
}