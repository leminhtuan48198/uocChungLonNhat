import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("No greatest common factor");
        } else if(a == 0 || b == 0){
            System.out.println("Greatest common factor: "+ (a>b? a:b));
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;}
            System.out.println("Greatest common factor: " + a);
        }
    }
}
