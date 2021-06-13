/**
 * input: 13
 * output: 17
 */
package Task;
import java.util.Scanner;
public class TotalNumberOfDigits {
    public static void main(String[] args) {
        int num,count=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=17;i*=10)
            count+=(num-i+1);
        System.out.println(count);


    }
}
