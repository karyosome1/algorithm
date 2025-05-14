class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {                   // 모든 명함에 대해 반복
            int width = Math.max(size[0], size[1]);  // 명함을 회전했을 때 가로 길이 (긴 쪽)
            int height = Math.min(size[0], size[1]); // 명함을 회전했을 때 세로 길이 (짧은 쪽)

            maxWidth = Math.max(maxWidth, width);    // 현재까지 최대 가로 길이 갱신
            maxHeight = Math.max(maxHeight, height); // 현재까지 최대 세로 길이 갱신
        }

        return maxWidth * maxHeight;                 // 지갑 크기 계산    
    }
}