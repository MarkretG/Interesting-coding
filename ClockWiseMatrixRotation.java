package TwoDimension;

import java.util.Scanner;

public class ClockWiseMatrixRotation {
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        m= sc.nextInt();
        n= sc.nextInt();
        int[][] mat=new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]= sc.nextInt();
            }
        }
        //clock wise rotation 90 degree
        for(int i=0;i<m;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
        //anti clock wise rotation
       /* for (int i = m - 1; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[j][i] + " ");

                }
                System.out.println();
            }

        */




    }
}
