class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) { // 각 절대값과 부호에 대해 반복
            if (signs[i] == true) { 
                answer += absolutes[i]; 
            } else {
                answer -= absolutes[i]; 
            }
        }
        return answer;
    }
}