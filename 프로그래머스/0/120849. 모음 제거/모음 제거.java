class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] removeString = {"a", "e", "i", "o", "u"};
        
        for (String s : removeString) {
            answer = answer.replaceAll(s, "");
        }
        
        return answer;
    }
}