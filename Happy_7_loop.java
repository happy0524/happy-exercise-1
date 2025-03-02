import java.util.Scanner;

public class Happy_7_loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("몇 단을 출력할까요? :");
        int dan = scan.nextInt();
        for (int k = 1; k<=9; k++) {
                System.out.println(dan + "X" + k + "=" + dan*k);
        }
    }
}
