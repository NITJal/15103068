/*   
 A simple program to multiply matrices in java
 time complexity O(n^3)
 @15103068

*/

import java.util.Scanner;

class MatrixMultiplication
{
   public static void main(String args[])
   {
      int a, b, m, n, sum = 0;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter row and column of first matrix");
      a = in.nextInt();
      b = in.nextInt();
 
      int first[][] = new int[a][b];
 
      System.out.println("Enter the elements of first matrix");
 
      for (int row = 0 ; row < a ; row++ )
         for (int col = 0 ; col < b ; col++ )
            first[row][col] = in.nextInt();
 
      System.out.println("Enter the number of rows and columns of second matrix:");
      m = in.nextInt();
      n = in.nextInt();
 
      if ( b != m )
         System.out.println("Invalid operation");
      else
      {
         int second[][] = new int[m][n];
         int multiply[][] = new int[a][b];
 
         System.out.println("Enter row and column of second");
 
         for (int row = 0 ; row < m ; row++ )
            for (int col = 0 ; col < n ; col++ )
               second[row][col] = in.nextInt();
 
         for (int row = 0 ; row < a ; row++ )
         {
            for (int col = 0 ; col < n ; col++ )
            {   
               for (int k = 0 ; k < m ; k++ )
               {
                  sum = sum + first[row][k]*second[k][col];
               }
 
               multiply[row][col] = sum;
               sum = 0;
            }
         }
         System.out.println("Multiplied matrix is");
          for (int row = 0 ; row < a ; row++ )
         {
            for (int col = 0 ; col < n; col++ )
               System.out.print(multiply[row][col]+"\t");
 
            System.out.print("\n");
         }
      }
   }
}