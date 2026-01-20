package ex_Lab011_Arrays;

public class Lab106_2D_Matrix {

    public static void main(String[] args) {


        int[][] matrix ={

                {1,2,3,4},
                { 4,5,6,7},
                {7,8,9,10}

        };
// Acessing though matrix

        System.out.println(matrix[0][1]);
        System.out.println("====================");
        System.out.println(matrix[2][3]);

        System.out.println("===========================");

//        Acessing though loop

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
