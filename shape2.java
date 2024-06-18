public class shape2 {
    public static void main(String[] args) {
      int i,j,k; 
      for(i=0;i<=10;i++)
      {
        for(j=9-i;j>=0;j--)
        {
        System.out.print(" ");
        }
        for(k=0;k<=i;k++)
        {
        System.out.print("*");
        }
        System.out.print("\n");
      }
    }
}
