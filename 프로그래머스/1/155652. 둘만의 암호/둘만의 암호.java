import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();
        for (char ch : skip.toCharArray()) {
            skipSet.add(ch);
        }
        
        for (char ch : s.toCharArray()) {
            int moved = 0;
            char cur = ch;
            
            while (moved < index) {
                cur++;
                if (cur > 'z') cur = 'a';
                if (!skipSet.contains(cur)) moved++;
            }
            
            answer.append(cur);
        }
        return answer.toString();
    }
}