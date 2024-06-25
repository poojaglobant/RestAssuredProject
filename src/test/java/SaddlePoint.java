public class SaddlePoint {

    public static void saddlePoint(int[][] matrix){

        for (int i=0; i<matrix.length; i++){
            int rowMin = matrix[i][0];
            int colIndex =0;
            boolean saddlePoint = true;

            //check weather num is minimum in the row
            for (int j=1; j<matrix[i].length;j++){
                if(matrix[i][j]<rowMin){
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }

            // check weather num is maximum in the column
            for(int j=0; j<matrix.length; j++){
                if(matrix[j][colIndex] > rowMin){
                    saddlePoint = false;
                    break;
                }
            }

            if(saddlePoint){
                System.out.println("Saddle Point is : " + rowMin);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { {1, 10, 4 },
                           {9, 3, 8 },
                           {15, 16, 17} };

        System.out.println(" The input matrix is : " );
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        saddlePoint(matrix);

    }
}
