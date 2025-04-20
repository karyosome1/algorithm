class Solution {
    public boolean solution(int x) {
        int sumOfDigits = 0;
        int temp = x;
        
        // 각 자릿수 합 구하기
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        
        // x가 각 자릿수의 합으로 나누어 떨어지는지 확인
        return x % sumOfDigits == 0;
    }
}