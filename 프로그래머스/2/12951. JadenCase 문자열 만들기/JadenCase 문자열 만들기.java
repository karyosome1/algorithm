class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isStart = true;
        
        for (char c : s.toCharArray()) {
            if (isStart) {
                // 단어의 시작일 경우
                if (Character.isLetter(c)) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(c); // 숫자나 공백은 그대로
                }
                isStart = false;
            } else {
                answer.append(Character.toLowerCase(c));
            }
            
            if (c == ' ') {
                isStart = true; // 다음 단어 시작
            }
        }
        return answer.toString();
    }
}