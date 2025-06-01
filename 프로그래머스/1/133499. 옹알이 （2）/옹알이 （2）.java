import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] possible = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (String word : babbling) {
            String prev = "";
            String temp = word;
            
            while (!temp.isEmpty()) {
                boolean matched = false;
                
                for (String p : possible) {
                    if (temp.startsWith(p) && !p.equals(prev)) {
                        temp = temp.substring(p.length());
                        prev = p;
                        matched = true;
                        break;
                    }
                }
                if (!matched) break;
            }
            if (temp.isEmpty()) answer++;
        }
        return answer;
    }
}