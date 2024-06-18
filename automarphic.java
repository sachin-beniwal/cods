import java.util.Scanner;

public class automarphic {
    public static void main(String[] args) {
        int a,c,temp,g=0,y=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter ur number\n");
        a = scan.nextInt();
        c=a*a;
        System.out.print("suqre of ur number is "+c+"");
        temp=a;
        while (temp>0) 
        {
            temp=temp/10;
            g++;
         }
         y=c;
         int h=0,j=0;
         for(int i=0;i<g;i++)
         {
            h=y%10;
            j=j*10+h;
            y=y/10;
         }
        if(j==a)
        {
System.out.print("\nnumber is automarphic");
        }
        else{
            System.out.print("\nnumber is not automarphic");
        }
    }
}
