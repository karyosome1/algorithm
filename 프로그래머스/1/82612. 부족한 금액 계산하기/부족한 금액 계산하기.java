class Solution {
    public long solution(int price, int money, int count) {
        // 총 이용료: 등차수열의 합 공식 활용
        long totalCost = (long) count * (price + (long) price * count) / 2;
        
        // 부족한 금액 반환
        if (money < totalCost) {
            return totalCost - money;
        } else {
            return 0;
        }
    }
}