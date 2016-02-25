/**
 * Created by llin on 2016-02-23.
 */
public class Code_1_6 {

    public static void main(String[] args){

    }

    public static void rotate(int[][] matrix, int n){
        for(int layer = 0; layer < n/2; layer++){
            for(int position = layer; position < n - 2*layer; position++){
                int temp = matrix[position][layer];
                matrix[layer][position] = matrix[n -1 - position][layer];
                matrix[n -1 - position][layer] = matrix[n - 1 - layer][n - 1 - position];
                matrix[n -1 - layer][n - 1 - position] = matrix[position][n - 1 - layer];
                matrix[position][n -1 - layer] = temp;
            }
        }
    }

}
