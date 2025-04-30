class Solution {
    public String solution(int n) {
        
        // n을 2로 나눈 몫만큼 pattern을 반복하여 저장
        String pattern = "수박";
        String repeatedPattern = pattern.repeat(n / 2);
        
        // n이 홀수인 경우
        if (n % 2 == 1) {
            repeatedPattern += "수"; 
        }
        return repeatedPattern;
    }
}