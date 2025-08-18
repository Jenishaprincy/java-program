import java.util.Scanner;

public class ShiftOperator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number: ");
            int n=sc.nextInt();
            System.out.println("enter the right shift value: ");
            int s=sc.nextInt();
            int total=n>>s;
            System.out.println(total);
        }
    }

}
