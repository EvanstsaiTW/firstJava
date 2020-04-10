import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        double count = 0;
        double sum = 0;
        for (; start <= end; start++) {
            if (start % 3 == 0) {
                sum += start;
                count += 1;
            }
        }

        System.out.println(sum / count);
    }
}