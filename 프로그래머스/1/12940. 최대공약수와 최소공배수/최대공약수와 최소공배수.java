class Solution {
    // 유클리드 호제법을 이용한 최대공약수 계산 함수
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public int[] solution(int num1, int num2) {
        int[] answer = new int[2];
        int greatestCommonDivisor = gcd(num1, num2);
        int leastCommonMultiple = (num1 * num2) / greatestCommonDivisor;
        
        answer[0] = greatestCommonDivisor;
        answer[1] = leastCommonMultiple;
        
        return answer;
    }
}