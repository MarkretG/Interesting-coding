package Task;
import java.util.Scanner;
public class BinaryDecimal {
    static void minimumBinary(int num)
    {
        while(num!=0)
        {
            int temp=num,p=0,q=1,rem;
            while(temp!=0)
            {
                rem=temp%10;
                temp=temp/10;
                if(rem!=0)
                    p=p+q;
                q=q*10;
            }
            num=num-p;

        }


    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        minimumBinary(num);
    }
}
