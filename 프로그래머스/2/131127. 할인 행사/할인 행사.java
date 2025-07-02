import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int result = 0;
        int windowSize = 10; // 고정된 10일
        
        // 1. 원하는 상품과 수량을 매핑
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        // 2. discount 배열을 슬라이딩 윈도우로 10일씩 이동
        for (int i = 0; i <= discount.length - windowSize; i++) {
            Map<String, Integer> discountMap = new HashMap<>();
            
            // 현재 10일 구간의 상품 수량 카운팅
            for (int j = i; j < i + windowSize; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }
            
            // 3. wantMap과 discountMap을 비교
            if (matches(wantMap, discountMap)) {
                result++;
            }
        }
        return result;
    }
    
    // wantMap과 discountMap이 완전히 일치하는지 확인
    private boolean matches(Map<String, Integer> wantMap, Map<String, Integer> discountMap) {
        for (String key : wantMap.keySet()) {
            if (discountMap.getOrDefault(key, 0) < wantMap.get(key)) {
                return false;
            }
        }
        return true;
    }
}