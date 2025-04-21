class Solution {
    public long solution(int a, int b) {
        long n = Math.abs(a - b) + 1;  // a와 b 사이의 정수 개수를 구하기
        return (long) (a + b) * n / 2; // 등차수열의 합 공식 ((첫째 항 + 마지막 항) * 항의 개수 / 2)
    }
    







}