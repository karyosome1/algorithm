import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> typeCount = new HashMap<>();
        
        // 각 의상 종류별 개수 세기
        for (String[] item : clothes) {
            typeCount.put(item[1], typeCount.getOrDefault(item[1], 0) + 1);
        }
        
        // 조합 계산 (각 종류별로 안 입는 경우 포함해서 + 1) 
        int answer = 1;
        for (int count : typeCount.values()) {
            answer *= (count + 1);
        }
        
        // 전부 안 입는 경우 제외
        return answer - 1;
    }
}