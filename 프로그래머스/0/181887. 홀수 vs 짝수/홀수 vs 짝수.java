class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int odd = 0;
        int even = 0;
        int j = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            if (j % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
            
            j++;
        }
        
        if (odd >= even) {
            answer = odd;
        } else if (odd < even) {
            answer = even;
        }
        
        return answer;
    }
}