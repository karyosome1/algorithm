class Solution {
    public int solution(int num) {
        if (num == 1) { // 주어진 수가 1인 경우 0 반환
            return 0;
        }
        
        int count = 0;
        long n = num; // int 범위를 넘어설 수 있으므로 long 타입으로 변경
        
        while (n != 1 && count < 500) { 
            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                n = n * 3 + 1;
            }
            count++; 
        }
        return (n == 1) ? count : -1; 
        // n이 1이면 (500번 이내 1이 된 경우) count 반환
        // n이 1이 아니면 (500번 반복해도 1이 되지 않은 경우) -1을 반환
    }
}