import java.util.Scanner;

public class DumbCalculator{
    public static void main( String[] args){
        float fnum;
        float snum;
        float tnum;
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nWhat is your first number? ");
        fnum = input.nextInt();
        System.out.print("\nWhat is your second number? ");
        snum = input.nextInt();
        System.out.print("\nWhat is your third number? ");
        tnum = input.nextInt();

        System.out.print("("+fnum +" + "+snum+" + "+tnum+" = "+ (fnum + snum + tnum)/2+")");        
    }
}