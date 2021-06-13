/**
 * input: 4
 * output:
 * 4 4 4 4 4 4 4
 * 4 3 3 3 3 3 4
 * 4 3 2 2 2 3 4
 * 4 3 2 1 2 3 4
 * 4 3 2 2 2 3 4
 * 4 3 3 3 3 3 4
 * 4 4 4 4 4 4 4
 *
 */





package Task;
import java.util.Scanner;
public class InnerReduceToOnePattern {
    public static void main(String[] args) {
        int n,temp,len;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        len=(n*2)-1;
        int[][] mat=new int[len][len];
        temp=n;
        int left=0,right=len-1,limit=0;
        while(len>limit) {
            for (int i = left; i <= right; i++) {
                for (int j = left; j <= right; j++) {
                    if(i==left||i==right||j==left||j==right)
                        mat[i][j]=temp;
                    if(i==right && j<right)
                        mat[i][j]=temp;

                }
            }
            left++;
            right--;
            temp--;
            limit++;
        }
        for (int i = 0; i <len; i++) {
            for (int j = 0;j<len; j++) {
                System.out.print(mat[i][j]+" ");

            }
            System.out.println(" ");
        }
    }
}
