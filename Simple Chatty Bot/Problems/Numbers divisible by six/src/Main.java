import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++) {
            int temp = scanner.nextInt();
            if (temp % 6 == 0) {
                count += temp;
            }
        }
        System.out.println(count);
    }
}