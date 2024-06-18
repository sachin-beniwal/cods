import java.util.Scanner;

public class multyplicationofarry {
    public static void main(String[] args) {
        int j,i,c=0;
        int [][]a=new int[2][3];
        int[][]b=new int[2][3];
        Scanner scan=new Scanner(System.in);
         System.out.print("enetr 1st arry valu\n");
        for(i=0;i<=1;i++){
        for(j=0;j<=2;j++){
         a[i][j]=scan.nextInt();
        }
        System.out.print("\n");
        }
        System.out.print("enetr 2nd arry valu\n");
        for(i=0;i<=1;i++){
        for(j=0;j<=2;j++){
         b[i][j]=scan.nextInt();
        }
         System.out.print("\n");
        }
        System.out.print("added valu\n");
        for(i=0;i<=1;i++){
        for(j=0;j<=2;j++){
            c=0;
            c=a[i][j]*b[i][j];
        System.out.print(c);
        }
        System.out.print("\n");
        }
        
    }
}
