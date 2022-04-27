import java.util.Scanner;

class SquareMatrixInfo {

    // upper Triangular matrix
    public static boolean isUpperTriangular(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i][j] != 0)
                    return false;
            }
        }
        return true;
    }

    // Lower Triangular matrix
    public static boolean isLowerTriangular(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                if (arr[i][j] != 0)
                    return false;
            }
        }
        return true;
    }

    // sparse matrix
    public static boolean isSparse(int[][] arr, int size) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0)
                    count++;
            }
        }
        if (count > (size * size) / 2)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of square matrix :");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("enter elements of matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix is  \n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        if (isUpperTriangular(arr))
            System.out.println("matrix is is Upper Triangular");
        if (isLowerTriangular(arr))
            System.out.println("matrix is Lower Triangular");
        if (isSparse(arr, n))
            System.out.println("matrix is sparse");
        else
            System.out.println("matrix is dense");

    }
}