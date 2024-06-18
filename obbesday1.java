import java.util.Scanner;

public class obbesday1 {

    public class employ {
        String name;
        int employnumber;
        int salery;
        String companyname;

        public void input() {
            Scanner scan = new Scanner(System.in);
            String f1 = new String();

            System.out.println("enter employ detales");
            System.out.println("enter company name");
            companyname = f1;
            System.out.println("enter employ number");
            employnumber = scan.nextInt();
            System.out.println("enter employ name");
            name = f1;
            System.out.println("enter employ salery");
            salery = scan.nextInt();

        }
    }

    public static void main(String[] args) {
        input();
    }
}
