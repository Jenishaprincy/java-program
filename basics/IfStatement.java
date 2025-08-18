import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter the number: ");
            int num=input.nextInt();
            if(num<100) {
            	System.out.println("given number is less than 100");		}
        }
    }

}
