import java.util.Scanner;

public class Happy_6_switch {
    public static void main (String[] args){
        System.out.println("점수를 입력하세요.");
        Scanner scanScore = new Scanner(System.in);
        int score = scanScore.nextInt();
        switch (score) {
            case (100):
                System.out.println("A");
                break;
            case (90):
                System.out.println("B");
                break;
            case (80):
                System.out.println("C");
                break;
            case (70):
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }

        System.out.println("점수를 입력하세요22");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String grade = (input >= 90) ? "A" : "B";
        System.out.println(grade + "학점입니다");
    }
}
