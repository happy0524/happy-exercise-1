import java.util.Scanner;

public class Happy_9_endless_loop {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scannum = new Scanner(System.in);

        while (true) {
            System.out.println("숫자 입력");
            int input = scannum.nextInt();

            if (input % 2 == 1) {
                System.out.println("짝수를 입력하라고");
                continue;
            }

            sum += input;
            System.out.println(sum);

            if (sum > 1000) {
                break;
            }
        }



    }
}
