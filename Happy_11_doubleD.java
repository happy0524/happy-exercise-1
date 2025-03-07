public class Happy_11_doubleD {
    public static void main(String[] args) {

        int [][] gugudan = new int [10][10];

        for (int i = 1; i <= 9; i++) {
            System.out.println("---" + i + "단---");
            for (int j = 1; j <= 9; j++) {
                gugudan[i][j] = i*j;
                System.out.println(gugudan[i][j]);
            }
        }

    }
}
