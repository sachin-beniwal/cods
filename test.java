import java.util.Scanner;
class employee1{
private int e_id,salary,ta,da,hra,pf,np;
String e_name;
public void input()
{
    Scanner s1=new Scanner(System.in);
    System.out.println("enter employee name:");
    e_name=s1.nextLine();
    System.out.println("enter employee id:");
    e_id=s1.nextInt();
    System.out.println("enter basic salary:");
    salary=s1.nextInt();
}
public void calculate()
{
    ta=(salary*3)/100;
    da=(salary*4)/100;
    hra=(salary*2)/100;
    pf=(salary*10)/100;
    np=salary+ta+da+hra-pf;
}
public void display()
{
    input();
    calculate();
    System.out.println("Employee name : "+e_name);
    System.out.println("Employee id :"+e_id);
    System.out.println("Basic salary :"+salary);
    System.out.println("TA :"+ta);
    System.out.println("DA :"+da);
    System.out.println("HRA :"+hra);
    System.out.println("PF :"+pf);
    System.out.println("Net salary :"+np);
}
}

public class test {
    public static void main(String[] args) {
        employee1 e1=new employee1();
        e1.display();
}
}
