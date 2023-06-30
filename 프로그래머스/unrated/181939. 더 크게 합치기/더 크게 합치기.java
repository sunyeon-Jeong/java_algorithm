class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        // 숫자 -> 문자열 : 숫자에 빈 문자열 더함
        String case1 = (a + "") + (b + "");
        String case2 = (b + "") + (a + "");
        
        if (Integer.parseInt(case1) >= Integer.parseInt(case2)) {
            answer += Integer.parseInt(case1);
        } else {
            answer += Integer.parseInt(case2);
        }
        
        return answer;
    }
}