import java.util.Scanner;

public class Happy_5_Conditional_statement {
    public static void main(String[] args) {
        System.out.println("학년을 입혁하세요.");
        Scanner scanGrade = new Scanner(System.in);
        int grade = scanGrade.nextInt();
        if (grade == 4) {
            System.out.println("점수를 입력하세요.");
            Scanner scanScore = new Scanner(System.in);
            int score = scanScore.nextInt();
            if (score >= 90) {
                System.out.println("Grade : A");
            } else if (80 <= score && score < 90) {
                System.out.println("Grade : B");
            }
        }
    }
}