class Solution {
    public int solution(int n) {
        int sum = 0;
        for (int i = 1; i * i <= n; i++) { // n의 제곱근까지만 반복
            if (n % i == 0) {              // i가 n의 약수인 경우
                sum += i; 
                if (i * i != n) { // i가 n의 제곱근이 아닌 경우
                    sum += n / i; // n / i도 n의 또 다른 약수
                }
            }
        }
        return sum;
    }
}