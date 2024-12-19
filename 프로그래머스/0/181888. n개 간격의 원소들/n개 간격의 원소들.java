import java.util.*;

class Solution {
    public List solution(int[] num_list, int n) {
        List<Integer> answerList = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i += n) {
            answerList.add(num_list[i]);
        }
        
//         int[] answer = new int[answerList.size()];
        
//         answer = answerList.toArray(answer);
        
        return answerList;
    }
}