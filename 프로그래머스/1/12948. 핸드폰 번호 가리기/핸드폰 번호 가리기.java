class Solution {
    public String solution(String phone_number) {
        // 전화번호의 뒷 4자리를 제외한 나머지 부분을 '*'로 반복 생성하고, 뒷 4자리와 연결하여 결과 반환
        return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4); 
    }
}