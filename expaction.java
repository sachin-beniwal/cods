import java.util.Scanner;

class input {
    int a;
    int b;
    Scanner Scan = new Scanner(System.in);

    void caek() {
        System.out.println("enter nuberm 1");
        a = Scan.nextInt();
        System.out.println("enter number 2");
        b = Scan.nextInt();
    }
}

class call extends input {
    public int c;

    void callulation() {
        c = a / b;
    }
}

class display extends call {
    void displayy() {
        System.out.println("answer is c\n" + c + "");
    }
}

public class expaction {

    public static void main(String[] args) {
        try{   
    c=100/0;  
 }catch(ArithmeticException e){System.out.println(e);}    
display m1=new display();
m1.caek();
m1.callulation();
m1.displayy();

    }
}
