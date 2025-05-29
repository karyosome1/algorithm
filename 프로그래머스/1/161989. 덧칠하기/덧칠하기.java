class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paintedUntil = 0;
        
        for (int sec : section) {
            if (paintedUntil <= sec) {
                paintedUntil = sec + m;
                answer++;
            }
        }
        return answer;
    }
}