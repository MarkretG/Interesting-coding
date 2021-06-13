package Task;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int sum=i;
            System.out.print(i+" ");
            for(int j=0;j<n-i;j++)
            {
                sum=(sum+6)-j;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
