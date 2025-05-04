import java.util.*;

class Solution {
    public String solution(String s) {
        // 문자열을 문자 배열로 변환하고, 오름차순 정렬 (유니코드 기준)
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        // 가변 문자열 생성 및 정렬된 문자 추가
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }

        // 내림차순 문자열 반환
        return sb.reverse().toString();
    }
}
