package Task;

import java.util.Scanner;

public class ThresholdPairCount {
    static void find(int[] a,int size,int th)
    {
        int count=0;
        for(int i=0;i<size;i++)
        {
            int temp=th;
            int sum=0;
            while(sum!=a[i])
            {
                sum=sum+temp;
                count++;
                if(sum>a[i])
                {
                    sum=sum-temp;
                    temp--;
                    count--;
                }
            }
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        int i, size,th;
        Scanner sc = new Scanner(System.in);
        System.out.println("array size");
        size = sc.nextInt();
        th=sc.nextInt();
        int[] a=new int[size];
        System.out.println("array elements");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        find(a,size,th);

    }
}

