class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            // t에서 길이가 p인 부분문자열 추출
            String sub = t.substring(i, i + p.length());
            
            // 추출한 문자열이 p보다 작거나 같으면 추가
            if (Long.parseLong(p) >= Long.parseLong(sub)) {
                answer++;
            }
        }         
        return answer;
    }
}