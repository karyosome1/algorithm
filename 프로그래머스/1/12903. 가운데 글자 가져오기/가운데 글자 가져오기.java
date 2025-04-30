class Solution {
    public String solution(String s) {
        int length = s.length();
        int middle = length / 2;
        
        if (length % 2 == 0) { // 짝수 길이
            return s.substring(middle - 1, middle + 1);
        } else { // 홀수 길이
            return s.substring(middle, middle + 1);
        }
    }
}