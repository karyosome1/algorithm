class Solution {
    public long solution(long n) {
        long answer = -1;                       // 제곱근이 아닌 경우
        long sqrtN = (long)Math.sqrt(n);        // n의 제곱근 계산. 예) 121 -> 11
        
        if (sqrtN * sqrtN == n) {               // 제곱근 * 제곱근 = 제곱인지 확인.    예) 11 * 11 = 121
            answer = (sqrtN + 1) * (sqrtN + 1); // (제곱근 + 1) * (제곱근 + 1) 할당. 예) 12 * 12 = 144
        }
        return answer;
    }
}