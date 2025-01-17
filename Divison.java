import java.util.Scanner;
public class Divison {
    static double n1,n2;
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        n1=sc.nextDouble();
        System.out.println("Enter a no.");
        n2=sc.nextDouble();
        System.out.println("your divisor is "+(n1/n2));
    }
}