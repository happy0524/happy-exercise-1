import java.util.Scanner;

public class Happy_8_whiledo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("몇 단을 출력할까요?");
        int dan = scan.nextInt();

        int i = 1;
        while (i <= 9) {
            System.out.println(dan + "X" + i + "=" + dan*i);
            i++;
        }

        Scanner scanNum = new Scanner(System.in);
        System.out.print("몇 단을 출력할까요?");
        int danny = scan.nextInt();

        int k = 1;
        do {
            System.out.println(danny + "X" + k + "=" + danny*k);
            k++;
        } while (k <= 9);
    }
}

// while 구구단