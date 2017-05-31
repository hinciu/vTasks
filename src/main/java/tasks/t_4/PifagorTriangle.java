package tasks.t_4;

/**
 * Created by sberber on 5/31/2017.
 */
public class PifagorTriangle {
    public  static void main(String[] args) {
        int n = 9;
        int col = (n - 1) + n;
        int row = n;
        int startPos = (col / 2);
        int[][] array = new int[col][row];
        int endPos;

        for (int i = 0; i < row; i++) {
            endPos = (startPos - i) + (i + 1) + ((i + 1) - 1) - 1;
            for (int k = startPos - i; k <= endPos; k += 2) {
                if (k == startPos - i || k == endPos) {
                    array[k][i] = 1;
                } else {
                    array[k][i] = array[k - 1][i - 1] + array[k + 1][i - 1];
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                if (array[k][i] == 0) {
                    System.out.print(" " + "\t");
                } else {
                    System.out.print(array[k][i] + "\t");
                }
            }
            System.out.println();
        }

    }

}

