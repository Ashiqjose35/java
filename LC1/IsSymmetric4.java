import java.io.*;
import java.util.Scanner;

class IsSymmetric4 {
  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    int row, col, i, j;
    boolean isSym;

    System.out.println("Enter the number of rows");
    row = sc.nextInt();

    System.out.println("Enter the number of columns");
    col = sc.nextInt();

    int mat[][] = new int[row][col];
    System.out.println("Enter the matrix");

    for (i = 0; i < row; i++) {
      for (j = 0; j < col; j++)
        mat[i][j] = sc.nextInt();
    }
    if (row != col) {
      System.out.println("The given matrix is not a square matrix, so not symmetric.");
    } else {
      isSym = true;
      for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
          if (mat[i][j] != mat[j][i]) {
            isSym = false;
          }
        }
      }
      if (isSym) {
        System.out.println("The given matrix is Symmetric");
      } else {
        System.out.println("The given matrix is not Symmetric");
      }

    }
  }
}
