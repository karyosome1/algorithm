import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (str1, str2) -> {
            char char1 = str1.charAt(n);
            char char2 = str2.charAt(n);
            
            if (char1 == char2) {
                return str1.compareTo(str2);
            } else {
                return Character.compare(char1, char2);
            }
        });
        return strings;
    }
}