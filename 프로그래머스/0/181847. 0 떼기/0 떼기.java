class Solution {
    public String solution(String n_str) {
        // 문자열 -> 숫자 -> 문자열 ; 형을 변환하면서 0이 사라짐
        int i = Integer.parseInt(n_str);
        
        String answer = Integer.toString(i);
        
        return answer;
    }
}