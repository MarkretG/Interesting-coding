package Task;

import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        long a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLong();
        b=sc.nextLong();
        int i=0,carry=0;
        int[] sum=new int[10];
        while(a!=0||b!=0)
        {
            sum[i++]=(int)((a%10+b%10+carry)%2);
            carry=(int)((a%10+b%10+carry)/2);
            a=a/10;
            b=b/10;
        }
        if(carry!=0)
            sum[i++]=carry;
        i--;
        while(i>=0)
            System.out.print(sum[i--]);

    }
}
