class Solution {
    public boolean solution(String s) {
        int len = s.length();
        // 길이가 4 혹은 6이고(AND)
        if (len != 4 && len != 6) {
            return false;
        }
        // 숫자로만 구성되어 있을 때 True 반환
        for (int i = 0; i < len; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            } 
        }
        return true;
    }
}