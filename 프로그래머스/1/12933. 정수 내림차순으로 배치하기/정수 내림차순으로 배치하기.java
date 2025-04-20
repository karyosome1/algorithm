import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);       // 정수 n을 문자열로 변환
        char[] charArray = s.toCharArray(); // 문자열 s를 문자 배열로 변환
        Arrays.sort(charArray);             // 오름차순으로 정렬
        StringBuilder sb = new StringBuilder(new String(charArray)); // 정렬된 문자 배열을 문자열로 변환하여 sb 객체 초기화
        return Long.parseLong(sb.reverse().toString());              // 문자열 sb를 뒤집어 내림차순으로 만들고 Long으로 반환
    }
}