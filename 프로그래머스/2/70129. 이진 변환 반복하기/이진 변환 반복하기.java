class Solution {
    public int[] solution(String s) {
        int binaryCount = 0;
        int removedZeros = 0;
        
        while (!s.equals("1")) {
            int onesCount = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') onesCount++;
                else removedZeros++;
            }
            
            s = Integer.toBinaryString(onesCount);
            binaryCount++;
        }
        return new int[]{binaryCount, removedZeros};
    }
}