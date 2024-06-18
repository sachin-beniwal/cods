import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        int a,i,flag;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter ur number");
        a = scan.nextInt();
      flag=0;
        if(a == 1){
         System.out.println("undfiable");
        }else if(a>1){
            for(i=2;i<a;i++){
            if(a%i==0){
                flag=1;
                break;
            }
            }
        }
        if(flag==1){
            System.out.println("number is not prime:"+a+"");
        }
        else if(flag==0){
         System.out.println("number is prime:"+a+"");
        }
        }
}