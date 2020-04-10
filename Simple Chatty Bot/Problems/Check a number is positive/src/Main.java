import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > 0) {
            System.out.println("YES");
        } else {
            System.out.print("NO");
        }
    }
}