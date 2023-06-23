import java.util.Scanner;

class Algorithm4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String text = scanner.next();
        String answer = "";
        
        for (int i = 0; i < text.length(); i++) {
            // 사용자입력 문자열 -> 문자로 변환
            char word = text.charAt(i);
            if (Character.isUpperCase(word)) {
                answer += Character.toLowerCase(word);
            } else {
                answer += Character.toUpperCase(word);
            }
        }
        System.out.print(answer);
    }
}