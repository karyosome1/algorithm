import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < survey.length; i++) {
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);
            int choice = choices[i];
            
            if (choice < 4) {
                map.put(first, map.getOrDefault(first, 0) + 4 - choice);
            } else if (choice > 4) {
                map.put(second, map.getOrDefault(second, 0) + choice - 4);
            }
            // choice == 4 는 점수 없음 (모르겠음)   
        }
        
        StringBuilder answer = new StringBuilder();
        String[] types = {"RT", "CF", "JM", "AN"};
        
        for (String type : types) {
            char first = type.charAt(0);
            char second = type.charAt(1);
            
            int score1 = map.getOrDefault(first, 0);
            int score2 = map.getOrDefault(second, 0);
            
            answer.append(score1 >= score2 ? first : second);
        }
        return answer.toString();
    }
}