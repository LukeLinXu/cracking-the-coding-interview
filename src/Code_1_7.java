/**
 * Created by llin on 2016-02-23.
 */
public class Code_1_7 {

    public static void main(String[] args){

    }

    public static void setZero(int[][] matrix){
        boolean[] x = new boolean[matrix.length];
        boolean[] y = new boolean[matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    x[i] = true;
                    y[i] = true;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(x[i] || y[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
