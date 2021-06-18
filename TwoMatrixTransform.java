package TwoDimension;

import java.util.Scanner;

public class TwoMatrixTransform {
    static int rotate(int[][] mat1,int n,int[][] mat2,int count) {
        int flag=0;
        for (int p =n-1; p >=n/ 2; p--) {
            for (int q = p; q >n- p - 1; q--) {
                int temp = mat1[p][q];

                mat1[p][q] = mat1[q][n- 1 - p];
                mat1[q][n- 1 - p] = mat1[n- 1 - p][n - 1 - q];
                mat1[n - 1 - p][n- 1 - q] = mat1[n- 1 - q][p];
                mat1[n - 1 - q][p] = temp;
            }
        }
        for(int l=0;l<n;l++)
        {
            for (int m=0;m<n;m++)
            {
                if(mat1[l][m]==mat2[l][m])
                    count++;
            }
        }
        return count;


}

public static void main(String[] args) {
        int n,i,value;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int[][] mat1={{1,2},{3,4}};
        int[][] mat2={{4,2},{3,1}};
        for( i=0;i<3;i++)
        {
            int count=0;
            value=rotate(mat1, n, mat2,count);
            if(value==n*n)
            {
                System.out.println("True");
                break;
            }
            if(i==2&&value!=n*n)
                System.out.println("false");

        }

    }
}





