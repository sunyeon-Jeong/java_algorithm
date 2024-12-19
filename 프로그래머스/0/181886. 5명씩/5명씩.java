import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> answerList = new ArrayList<>();
        
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                answerList.add(names[i]);
            }
        }
        
        String[] answer = new String[answerList.size()];
        
        answer = answerList.toArray(answer);
        
        return answer;
    }
}