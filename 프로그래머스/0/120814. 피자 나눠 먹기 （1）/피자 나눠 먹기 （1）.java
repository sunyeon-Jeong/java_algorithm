class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizzaNum = 7;
        
        if (n % pizzaNum == 0) {
            answer = n / pizzaNum;
        } else {
            answer = n / pizzaNum + 1;
        }
        
        return answer;
    }
}