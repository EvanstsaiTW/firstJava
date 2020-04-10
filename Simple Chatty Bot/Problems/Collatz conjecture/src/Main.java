import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.print(value + " ");
        while (value != 1) {
            if (value % 2 == 0) {
                value = value / 2;
                System.out.print(value + " ");
            } else {
                value = value * 3 + 1;
                System.out.print(value + " ");
            }
        }
    }
}