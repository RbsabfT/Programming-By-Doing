import java.util.Scanner;
public class AgeMessage {
    public static void main(String[] args){
        Scanner I = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = I.nextLine();
        System.out.print("Your age: ");
        int age = I.nextInt();

        if(age<16){
            System.out.print("You can't drive.");
        }else if(age>=16 && age<18){
            System.out.print("You can drive but not vote.");
        }else if(age>=18 && age<25){
            System.out.print("You can vote but not rent a car.");
        }else if(age>=25){
            System.out.print("You can do pretty much anything.");
        }
    }
}