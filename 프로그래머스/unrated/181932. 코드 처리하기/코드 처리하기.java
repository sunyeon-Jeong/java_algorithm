class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++) {
            String word = code.substring(i, i+1);
            
            if(mode == 0) {
                if(!word.equals("1")) {
                    if (i % 2 == 0) {
                        answer += word;
                    }
                } else {
                    mode = 1;
                }
            } else {
                if(!word.equals("1")) {
                    if(i % 2 == 1) {
                        answer += word;
                    }
                } else {
                    mode = 0;
                }
            }
        }
        
        if(answer.equals("")) {
            answer = "EMPTY";
        }
        
        return answer;
    }
}