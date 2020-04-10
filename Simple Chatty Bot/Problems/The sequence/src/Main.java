//special solution
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int count = 0;
        int temp;

        for (int i = 1; count < total; i++) {
            temp = 0;
            do {
                count += 1;
                System.out.print(i + " ");
                temp += 1;
            } while (temp < i && count < total);
        }
    }
}


//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int loadInt = scanner.nextInt();
//        boolean stop = true;
//        int i = 1;
//        int k = 0;
//        while (stop) {
//            for (int j = 1; j <= i; j++) {
//                if (k == loadInt) {
//                    stop = false;
//                    break;
//                }
//                k++;
//                System.out.println(i + " ");
//            }
//            i++;
//        }
//
//    }
//}
