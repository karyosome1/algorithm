import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        int kimIndex = Arrays.asList(seoul).indexOf("Kim"); 
        // seoul 배열을 List로 변환 후 "Kim"의 인덱스를 찾아 kimIndex 변수에 저장
        return "김서방은 " + kimIndex + "에 있다";
    }
}