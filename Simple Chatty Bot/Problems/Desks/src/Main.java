import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int totalDesk = 0;
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int c3 = scanner.nextInt();

        totalDesk += c1 / 2 + c1 % 2;
        totalDesk += c2 / 2 + c2 % 2;
        totalDesk += c3 / 2 + c3 % 2;

        System.out.print(totalDesk);

    }
}