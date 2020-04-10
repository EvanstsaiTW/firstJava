import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String c1 = scanner.next().substring(scanner.nextInt(), scanner.nextInt() + 1);
        System.out.println(c1);


    }
}