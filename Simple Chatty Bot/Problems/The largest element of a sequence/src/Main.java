import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int large = 0;
        int next;

        do {
            next = scanner.nextInt();
            if (next > large) {
                large = next;
            }
        } while (next != 0);
        System.out.println(large);
    }
}