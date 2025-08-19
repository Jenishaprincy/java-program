import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number :");
		int limit=in.nextInt();
		System.out.println("prime number from 1 to "+limit+" is:");
		for(int num=2;num<=limit;num++) {
			int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}		
		if(count==2) {
			System.out.println(num);
		}
		}
        in.close();
    


}
}
