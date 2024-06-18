import java.util.Scanner;

public class kk {
    public static void main(String[] args) {
        int a, temp, y, k, j = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number: ");
        a = scan.nextInt();
        temp = a;

        while (temp > 0) {
            y = temp % 10;
            k = 1;

            for (int i = y; i >= 1; i--) {
                k *= i;
            }

            j += k;
            temp /= 10;
        }

        if (j == a) {
            System.out.println("Number is Paterson");
        } else {
            System.out.println("Number is not Paterson");
        }
    }
}
