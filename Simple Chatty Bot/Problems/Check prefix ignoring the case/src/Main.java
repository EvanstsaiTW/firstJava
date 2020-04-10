import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean b1 = scanner.next().toLowerCase().startsWith("j");
        // can't be 'j' should be "j"

        System.out.println(b1);
    }
}