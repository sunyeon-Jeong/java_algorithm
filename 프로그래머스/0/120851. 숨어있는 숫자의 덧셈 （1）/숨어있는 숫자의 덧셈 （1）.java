class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] array = my_string.replaceAll("[a-zA-z]", "").split("");
        
        for (int i = 0; i < array.length; i++) {
            answer += Integer.parseInt(array[i]);
        }
        
        return answer;
    }
}