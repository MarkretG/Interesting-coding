package Task;

import java.util.Scanner;

public class FindSquareBetweenRange {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            for(int j=1;j*j<=i;j++)
            {
                if(i==j*j)
                    System.out.println(i);
            }
        }
    }
}
