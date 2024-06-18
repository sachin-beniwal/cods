import java.util.Scanner;
public class more {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("enter number 1");
        a=scan.nextInt();
        System.out.println("enter nuber 2");
        b=scan.nextInt();
        c=a/b;
        try{  
        
            int dT=100/0;  
         }catch(ArithmeticException e){System.out.println(e);}
         System.out.println("as"+c+"");  
    }
}
