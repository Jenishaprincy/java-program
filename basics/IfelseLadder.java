import java.util.Scanner;

public class IfelseLadder {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("enter the temperature: ");
            int temp=in.nextInt();
            if(temp<=15) {
            	System.out.println("cool");
            }
            else if(temp<=20) {
            	System.out.println("chill");
            		}		
            else if(temp<=30) {
            	System.out.println("normal");
            }else {
            	System.out.println("hot");
            }
        }

    }

}
