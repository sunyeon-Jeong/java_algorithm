class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String odd = ""; // 홀수
        String even = ""; // 짝수
        
        for (int i = 0; i < num_list.length; i++) {
            int tmp = num_list[i];
            
            if (tmp % 2 == 0) {
                even += String.valueOf(tmp);
            } else {
                odd += tmp + "";
            }
        }
        
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        
        return answer;
    }
}