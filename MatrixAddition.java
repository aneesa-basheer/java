import java.util.Scanner;
public class MatrixAddition {
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of rows in Matrix A: ");
        int p = s.nextInt();

        System.out.print("Enter number of columns in Matrix A: ");
        int q = s.nextInt();

        System.out.print("Enter number of rows in Matrix B: ");
        int m = s.nextInt();

        System.out.print("Enter number of columns in Matrix B: ");
        int n = s.nextInt();

        if (p==m && q==n) {

            int a[][] = new int[p][q];
            int b[][] = new int[m][n];
            int sum[][] = new int[p][q];

            System.out.println("Enter elements of Matrix A:");
            for (int i=0;i< p; i++) {
                for (int j = 0; j < q; j++) {
                    a[i][j] = s.nextInt();
                }
            }

            System.out.println("Enter elements of Matrix B:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    b[i][j] = s.nextInt();
                }
            }


            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }


            System.out.println("Sum Matrix:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Matrix addition not possible. Dimensions must be equal.");
        }

        s.close();
    }
}
