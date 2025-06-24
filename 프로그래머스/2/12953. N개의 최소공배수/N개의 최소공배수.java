class Solution {
    public int solution(int[] arr) {
        int lcmValue = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            lcmValue = lcm(lcmValue, arr[i]);
        }
        return lcmValue;
    }
    
    // 최대공약수(GCD) - 유클리드 호제법
    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    
    // 최소공배수 (LCM)
    private int lcm(int a, int b) {
        return a * ( b / gcd(a, b));
    }
}