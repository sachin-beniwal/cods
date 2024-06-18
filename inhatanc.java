import java.util.Scanner;

class Employdetals {
   String name;
   long phnumber;
   String epemail;
   Scanner scan = new Scanner(System.in);

   void input() {
      System.out.println("enter employ name");
      name = scan.nextLine();
      System.out.println("enter employ phone number");
      phnumber = scan.nextInt();
      scan.nextLine();
      System.out.println("enter employ email id");
      epemail = scan.nextLine();
   }
}

class Companydetals extends Employdetals {
   String companyname;
   long companyphnumber;
   String companyemail;

   void comanyinput() {
      System.out.println("enter company name");
      companyname = scan.nextLine();
      System.out.println("enter company number");
      companyphnumber = scan.nextInt();
      scan.nextLine();
      System.out.println("enter company email");
      companyemail = scan.nextLine();
   }
}

class Manerjar extends Companydetals {
String dejignasen;
void mninput()
{
   System.out.println("enter employ dejissdbkjr");
   dejignasen=scan.nextLine();
}
}

public class inhatanc {
   public static void main(String[] args) {
      Manerjar e1 = new Manerjar();
      e1.input();
      e1.comanyinput();
      e1.mninput();
      System.out.println(e1.dejignasen);
   }
}