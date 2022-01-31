package doublecolonoperator;

public class Calculator {

    public static void findSum(int x,int y){
        System.out.println("Sum " + (x+y));
    }

    public void findMultiply(int x,int y){
        System.out.println("Multiply " + (x*y));
    }

    public static void findDivision(int x, int y){
        System.out.println("Division result " + x/y);
    }

    public void findRemaider(int x, int y){
        System.out.println("Remainder of the division " + x%y);
    }
}
