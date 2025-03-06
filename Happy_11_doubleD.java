public class Happy_11_doubleD {
    public static void main(String[] args) {

        int [][] matrix = new int [3][3];
        int x = 1;
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = x;
                x++;
            }
        }

        for(int k = 0; k < matrix.length; k++) {
            for (int h = 0; h < matrix[0].length; h++) {
                System.out.print(matrix[k][h] + " ");
            }
            System.out.println("");
        }

    }
}
