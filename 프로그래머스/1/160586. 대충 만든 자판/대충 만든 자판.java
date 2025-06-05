import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> keyPressMap = new HashMap<>();
        
        // 1. 각 문자에 대해 최소 누룸 횟수 저장
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                keyPressMap.put(c, Math.min(keyPressMap.getOrDefault(c, i + 1), i + 1));
            }
        }
        
        // 2. 각 target 문자열에 대해 최소 누름 횟수 계산
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            boolean isPossible = true;
            
            for (char c : targets[i].toCharArray()) {
                Integer pressCount = keyPressMap.get(c);
                if (pressCount == null) {
                    sum = -1;
                    isPossible = false;
                    break;
                }
                sum += pressCount;
            }
            answer[i] = sum;
        }
        return answer;
    }
}