class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer.append(' ');
                count = 0;
            } else {
                if (count % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                count++;
            }
        }

        return answer.toString();
    }
}
