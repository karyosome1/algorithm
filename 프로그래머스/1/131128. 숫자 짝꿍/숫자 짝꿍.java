class Solution {
    public String solution(String X, String Y) {
        int[] xDigitCounts = countDigits(X);
        int[] yDigitCounts = countDigits(Y);
        StringBuilder partnerNumber = new StringBuilder();
        
        for (int digit = 9; digit >= 0; digit--) {
            int commonCount = Math.min(xDigitCounts[digit], yDigitCounts[digit]);
            for (int i = 0; i < commonCount; i++) {
                partnerNumber.append(digit);
            }
        }
        
        if (partnerNumber.length() == 0) {
            return "-1";
        }
        
        if (partnerNumber.charAt(0) == '0') {
            return "0";
        }
        return partnerNumber.toString();
    }
    
    private int[] countDigits(String number) {
        int[] digitCounts = new int[10];
        for (int i = 0; i < number.length(); i++) {
            digitCounts[number.charAt(i) - '0']++;
        }
        return digitCounts;
    }
}