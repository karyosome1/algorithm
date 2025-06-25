class Solution {
    public long solution(int n) {
        long[] ways = new long[2001]; // ways[i]: i칸을 가는 방법의 수를 저장
        ways[1] = 1;                  // 1칸을 가는 방법: 1가지
        ways[2] = 2;                  // 2칸을 가는 방법: 2가지 (1+1, 2)
        
        for (int i = 3; i <= n; i++) {
            ways[i] = (ways[i - 1] + ways[i - 2]) % 1234567;
        }
        return ways[n];               // n칸을 가는 방법의 수
    }
}