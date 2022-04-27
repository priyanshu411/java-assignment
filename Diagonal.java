import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter size of square matrix :");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("enter elements of matrix..");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("matrix is  \n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Diagonal are \n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i + j == n - 1)
                    System.out.print(arr[i][j]+" ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}