import java.util.Scanner;
class fact{
    Scanner sc = new Scanner (System.in);
    int n;
    fact()
    {
        System.out.println("Enter the number");
        n = sc.nextInt();
    }
    int check()
    {
        int i,f=1;
        for(i=2;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
}
public class Factorial{
    public static void main(String[] args)
    {
        fact f1 = new fact();

        System.out.println("The factorial is " + f1.check());
    }
}