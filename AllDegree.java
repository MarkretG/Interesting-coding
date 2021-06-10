package TwoDimension;

import java.util.Scanner;

public class AllDegree {

    //anti clock 90 degree
    static void rotate(int[][] mat,int n)
    {
        for(int p=0;p<n/2;p++)
        {
            for(int q=p;q<n-p-1;q++)
            {
                int temp=mat[p][q];

                mat[p][q]=mat[q][n-1-p];
                mat[q][n-1-p]=mat[n-1-p][n-1-q];
                mat[n-1-p][n-1-q]=mat[n-1-q][p];
                mat[n-1-q][p]=temp;
            }
        }
    }

     /*
     //clock 90 degree
    static void rotate(int[][] mat,int m,int n) {
        for (int p =m-1; p >n/ 2; p--) {
            for (int q = p; q > n- p - 1; q--) {
                int temp = mat[p][q];

                mat[p][q] = mat[q][n- 1 - p];
                mat[q][n- 1 - p] = mat[n- 1 - p][n - 1 - q];
                mat[n - 1 - p][n- 1 - q] = mat[n- 1 - q][p];
                mat[n - 1 - q][p] = temp;
            }
        }
    }

      */
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

        for(int i=0;i<2;i++)
        {
            rotate(mat,n);
        }


        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }



    }
}

