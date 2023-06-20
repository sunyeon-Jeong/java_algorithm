import java.util.Scanner;

class Algorithm3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.next();
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}