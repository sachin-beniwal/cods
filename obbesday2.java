import java.util.Scanner;
class employ {
        int basicsalery;
       Scanner sacn=new Scanner(System.in);
    public employ(){
        System.out.println("walcome");
        basicsalery=10000;
    }

        public void input(int employnumber,String name) {
            this.em = employnumber;
            this.name = name;
        }
        public void display(){
            
            System.out.println("employ name is:"+name+"");
            System.out.println("employ salry is:"+basicsalery+"");
            System.out.println("employ employnuber is:"+employnumber+"");

        }
    }
public class obbesday2 {
    
    public static void main(String[] args) {
    employ e1=new employ();
        e1.input(101,"sachin");
        e1.display();

    }
}
