import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // 가변형 리스트
        List<String> answerList = new ArrayList<>();
        
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answerList.add(todo_list[i]);
            }
        }
        
        // 리스트 -> 문자열 배열로 변환
        String[] answer = new String[answerList.size()];
        
        answer = answerList.toArray(answer);
        
        return answer;
    }
}