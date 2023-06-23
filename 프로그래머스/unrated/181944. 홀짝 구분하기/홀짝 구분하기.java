import java.util.Scanner;

class Algorithm9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else if (num % 2 != 0) {
            System.out.println(num + " is odd");
        }
    }
}