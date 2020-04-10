import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // put your code here
        int n1 = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean partyAtWeekday = n1 >= 10 && n1 <= 20 && !isWeekend;
        boolean partyAtWeekend = n1 >= 15 && n1 <= 25 && isWeekend;
        System.out.println(partyAtWeekday || partyAtWeekend);
    }
}