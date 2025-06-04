class Solution {
    public int solution(String s) {
        int answer = 0;
        int targetCount = 0;
        int otherCount = 0;
        char targetChar = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (targetCount == 0) {
                targetChar = current;
                targetCount = 1;
                continue;
            }
            
            if (current == targetChar) {
                targetCount++;
            } else {
                otherCount++;
            }
            
            if (targetCount == otherCount) {
                answer++;
                targetCount = 0;
                otherCount = 0;
            }
        }
        if (targetCount != 0) {
            answer++;
        }
        return answer;
    }
}