/**
 * input:2 -3 -4 5 9 7 8
 * output:2 5 9
 */

package Task;
import java.util.Scanner;
public class GreaterPreviousElements {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(a[0]);
        for(int i=1;i<n;i++)
        {
            int count=0,flag=1;
                for(int j=i-1;j>=0;j--)
                {
                    if(a[i]>a[j])
                        flag=0;
                    else
                        count=1;
                }
            if(count==0&&flag==0)
                System.out.println(a[i]);
        }
    }
}
