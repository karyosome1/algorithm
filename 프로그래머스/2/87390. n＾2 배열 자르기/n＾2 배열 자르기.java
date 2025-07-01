class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int) (right - left + 1);
        int[] answer = new int[size];
        
        for (int i = 0; i < size; i++) {
            long idx = left + i;
            long row = idx / n;
            long col = idx % n;
            answer[i] = (int)(Math.max(row, col) + 1);
        }
        return answer;
    }
}