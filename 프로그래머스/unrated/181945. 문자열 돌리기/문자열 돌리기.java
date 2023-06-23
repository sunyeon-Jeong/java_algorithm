import java.util.Scanner;

class Algorithm8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String text = scanner.next();
        
        for (int i = 0; i < text.length(); i++) {
            char word = text.charAt(i);
            
            System.out.println(word);
        }
    }
}