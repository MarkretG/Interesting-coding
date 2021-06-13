/**
  input:4
  output:
    4 4 4 4
    4 3 3 4
    4 3 3 4
    4 4 4 4
 */

package Task;
import java.util.Scanner;
public class SpiralEvenPattern {
    public static void main(String[] args) {
        int n,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[][] mat=new int[n][n];
        temp=n;
        int left=0,right=n-1,limit=0;
        while(n>limit) {
            for (int i = left; i <= right; i++) {
                for (int j = left; j <= right; j++) {
                    if(i==left||i==right||j==left||j==right)
                         mat[i][j]=temp;

                }
            }
            left++;
            right--;
            temp--;
            limit++;
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0;j<n; j++) {
                System.out.print(mat[i][j]+" ");

            }
            System.out.println(" ");
        }

    }
}
