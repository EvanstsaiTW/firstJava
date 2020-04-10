import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextLong();
        long cumsum = 1;
        int start = 1;
        do {
            cumsum = cumsum * start;
            start++;
        } while (cumsum <= value);
        System.out.println(start - 1);
    }
}