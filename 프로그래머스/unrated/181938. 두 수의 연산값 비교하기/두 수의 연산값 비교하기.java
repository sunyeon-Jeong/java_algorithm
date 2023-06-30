class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String case1 = (a + "") + (b + "");
        int case2 = 2 * a * b;
        
        if (Integer.parseInt(case1) >= case2) {
            answer += Integer.parseInt(case1);
        } else {
            answer += case2;
        }
        
        return answer;
    }
}