class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffeeCost = 5500;
        
        answer[0] = money / coffeeCost;
        answer[1] = money % coffeeCost;
        
        return answer;
    }
}