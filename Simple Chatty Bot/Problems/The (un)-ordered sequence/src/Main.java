// nice task
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int value;
        int first = scanner.nextInt();
        int totalLen = 1;
        int count = 1;


        while (first != 0) {
            value = scanner.nextInt();
//            first check if the value is 0, if 0, break the while loop

            if (value == 0) {
                first = value;
                break;
            }

//        if not than add 0
//        then compare it with the counter if all + 1 than will equal to total len
//        if yes return yes , if not equal return false

            if (value > first) {
                count += 0;
                first = value;
                totalLen += 1;

            } else if (value < first) {
                count += 1;
                first = value;
                totalLen += 1;
            }
        }

        if (count == 1 || count == totalLen) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}



//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean asc = true;
//        boolean des = true;
//        int last = sc.nextInt();
//        int v;
//        while ((v = sc.nextInt()) != 0 && (asc || des)) {
//            asc &= last <= v;
//            des &= last >= v;
//            last = v;
//        }
//        System.out.println(asc || des);
//    }
//}