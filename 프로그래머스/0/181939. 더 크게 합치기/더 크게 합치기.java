class Solution {
    public int solution(int a, int b) {
        int answer1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int answer2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        return (answer1 > answer2) ? answer1 : answer2;
    }
}