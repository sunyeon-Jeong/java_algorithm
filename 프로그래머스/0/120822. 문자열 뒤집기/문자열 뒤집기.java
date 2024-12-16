class Solution {
    public String solution(String my_string) {
        
        StringBuffer strbuffer = new StringBuffer(my_string);
        
        String answer = strbuffer.reverse().toString();
        
        return answer;
    }
}