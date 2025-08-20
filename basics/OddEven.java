import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		int result=(num/2)*2;
		if(result==num) {
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
        sc.close(); 
    }

}
