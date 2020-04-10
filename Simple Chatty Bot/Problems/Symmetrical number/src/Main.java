import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int first = input / 1000;
        int second = input / 100 % 10;
        int third = input / 10 % 10;
        int fourth = input / 1 % 10;

        String firstS = String.valueOf(first);
        String secondS = String.valueOf(second);
        String thirdS = String.valueOf(third);
        String fourthS = String.valueOf(fourth);

        String first2 = firstS + secondS;
        String last2 = fourthS + thirdS;

        if (first2.equals(last2)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}