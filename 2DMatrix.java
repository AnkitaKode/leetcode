import java.util.*;

public class Main {
        public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return ;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1. Left to Right
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

           
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        for(int i=0;i<result.size();i++){
          System.out.print(result.get(i));
        }



    }
}

