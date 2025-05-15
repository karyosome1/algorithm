class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (char character : s.toCharArray()) {
            if (character == ' ') {
                answer.append(character);
                continue;
            }
            
            int baseAscii = Character.isUpperCase(character) ? 'A' : 'a';
            int shiftedValue = (character - baseAscii + n) % 26;
            answer.append((char) (baseAscii + shiftedValue));
        }
        return answer.toString();
    }
}
