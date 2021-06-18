package TwoDimension;
import java.util.Scanner;
class Sub
{
    static void subMatrix(int[][] big,int[][] small,int M,int N)
    {
        int x=0,y=0,count=0,flag=0;
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(big[i][j]==small[x][y])
                {
                  count++;
                  if(y<N)
                      y++;
                  if(y>=N)
                  {
                      x++;
                      y=0;
                  }
                  if(count==N*N)
                      flag=1;

                }

            }
        }
        if(flag==1)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
public class BigMatrix {
    public static void main(String[] args) {
        int M,N;
        Scanner sc=new Scanner(System.in);
        M=sc.nextInt();
        N= sc.nextInt();
        int[][] big=new int[M][M];
        int[][] small=new int[N][N];
        System.out.println("enter big matrix elements");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                big[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter small matrix elements");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                small[i][j]=sc.nextInt();
            }
        }
        Sub.subMatrix(big,small,M,N);

    }
}
