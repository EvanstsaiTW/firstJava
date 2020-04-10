import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            value  = scanner.nextInt();
            if (value == 0) {
                break;
            }
            if (value % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } while (value != 0);
    }
}