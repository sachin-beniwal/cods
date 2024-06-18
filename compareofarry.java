import java.util.Scanner;

public class compareofarry {
    public static void main(String[] args) {
        int i,j,flag=0;
        int [][]a=new int [2][3];
        int [][]b=new int [2][3];
       Scanner scan=new Scanner(System.in);
       System.out.println("enter first arry");
       for(i=0;i<=1;i++)
       {
        for(j=0;j<=2;j++)
        {
         a[i][j]=scan.nextInt();
        }
        System.out.print("\n");
       }
        System.out.println("enter 2nd arry");
       for(i=0;i<=1;i++)
       {
        for(j=0;j<=2;j++)
        {
         b[i][j]=scan.nextInt();
        }
        System.out.print("\n");
       }
       for(i=0;i<=1;i++)
       {
        for(j=0;j<=2;j++)
        {
        if(a[i][j]!=b[i][j])
        {
            flag=1;
        }
        }
       }
       if(flag==0)
       {
        System.out.print("a and b r equl");
       }
       else if(flag==1)
       {
        System.out.print("a and b r not equal");
       }
    }
}
