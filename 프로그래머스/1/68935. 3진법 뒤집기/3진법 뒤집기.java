class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        // 10진법 -> 역순으로 저장된 3진법
        while (n != 0) {
            sb.append(n % 3); 
            n /= 3;
        }
        
        // 역순으로 저장된 3진법 -> 10진법
        return Integer.parseInt(sb.toString(), 3);
    }
}
