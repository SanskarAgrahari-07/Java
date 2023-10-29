import java.util.Scanner;
class palin
{
    Scanner sc = new Scanner(System.in);
    int n;
    palin()
    {
        System.out.println("Enter the number");
        n = sc.nextInt();
    }
    void check()
    {
        int rem, rev=0,num = n;
        while(n>0)
        {
            rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        if(num==rev)
            System.out.println(num + " is a palindrome number");
        else
            System.out.println(num + " is not a palindrome number");
        
    }
}
public class Palindrome
{
    public static void main(String[] args)
    {
        palin p1 = new palin();
        p1.check();
    }
}