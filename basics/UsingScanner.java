import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("enter age: ");
            byte age=in.nextByte();
            System.out.println("enter height: ");
            short height=in.nextShort();
            System.out.println("enter salary: ");
            int salary=in.nextInt();
            System.out.println("enter phone no:");
            long phone=in.nextLong();
            System.out.println("enter weight: ");
            float weight=in.nextFloat();
            System.out.println("enter location:");
            double location=in.nextDouble();
            System.out.println("enter boolean value(true/false):");
            boolean value=in.nextBoolean();
            System.out.println("enter any string: ");
            char firstletter=in.next().charAt(0);
            System.out.println("your age:"+age);
            System.out.println("your height:"+height);
            System.out.println("your salary:"+salary);
            System.out.println("your number:"+phone);
            System.out.println("your weight:"+weight);
            System.out.println("your location:"+location);
            System.out.println("value:"+value);
            System.out.println("character:"+firstletter);
        }
		
    }

}
