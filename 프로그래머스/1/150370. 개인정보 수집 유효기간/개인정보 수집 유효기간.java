import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        
        // 약관 종류 -> 유효기간(달) 저장
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] parts =term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }
        
        // 오늘 날짜를 일수로 변환
        int todayDays = toDays(today);
        
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String date = parts[0];
            String type = parts[1];
            
            int collectedDays = toDays(date);
            int validMonths = termMap.get(type);
            int expiryDays = collectedDays + validMonths * 28;
            
            if (expiryDays <= todayDays) {
                result.add(i + 1);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    
    // YYYY.MM.DD -> 총 일수 변환 (모든 달이 28일 기준)
    private int toDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        return year * 12 * 28 + month * 28 + day;
    }
}