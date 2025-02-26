import java.awt.*;
import java.util.Scanner;

public class Happy_3 {
    public static void main(String[] args) {

        // 상수 선언과 사칙 연산

        final int year = 2024;
        System.out.println(year);
        System.out.println(100*3);
        System.out.println(year*3);
        System.out.println("123" + 4);
        System.out.println("I'm " + year + " years old");

        // 값을 입력받아 사칙연산

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int add = a - b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println("덧셈 결과: " +add);
        System.out.println("뺄셈 결과: " +sub);
        System.out.println("곱셈 결과: " +mul);
        System.out.println("나눗셈 결과: " +div);
    }
}
