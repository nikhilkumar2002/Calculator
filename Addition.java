import java.util.Scanner;
public class Addition {
    static int n1,n2;
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        n1=sc.nextInt();
        System.out.println("Enter a no.");
        n2=sc.nextInt();
        System.out.println("your sum is "+(n1+n2));
    }
}