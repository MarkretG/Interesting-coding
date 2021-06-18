package Task;
import java.util.Scanner;
public class zoho {
     static void find(String str)
     {
         char[] ch=new char[20];
         String temp="0";
         int sum=0,k=0;
         for(int i=0;i<str.length();i++)
         {
             char c=str.charAt(i);
             if(Character.isDigit(c))
             {
                 temp=temp+c;
             }
             else
             {
                 ch[k]=str.charAt(i);
                 k++;
                 sum=sum+Integer.parseInt(temp);
                 temp="0";

             }
         }
         System.out.println(sum+Integer.parseInt(temp));
         for(int m=0;m<k;m++)
             System.out.print(ch[m]);
     }
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str= sc.nextLine();
        find(str);

    }
}
