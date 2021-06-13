package Task;

import java.util.Scanner;

public class MinimumOfGreater {
    public static void main(String[] args) {
        int n,i,j,sum;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();

        for(i=0;i<n;i++)
        {
            int max=Integer.MAX_VALUE;

            for(j=0;j<n;j++) {
                if (a[j] > a[i]) {
                    sum = a[j];
                    if (sum < max)
                        max = sum;
                }
            }
            if(max==Integer.MAX_VALUE)
                System.out.print(a[i]+">"+" ");
            else
                System.out.print(a[i]+">"+max+" ");
        }
    }
}
