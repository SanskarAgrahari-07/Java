import java.util.Scanner;
class Palindrome{
    Palindrome() {
      Scanner sc = new Scanner(System.in);
	   String str, str1 = "";
	   char ch;
	   System.out.println("Enter the string");
	   str = sc.next();
	   for(int i=0;i<str.length();i++)
	   {
	       ch=str.charAt(i);
	       str1 = ch + str1;
	   }
	   if(str.equalsIgnoreCase(str1))
	   System.out.println(str + " is a palindrome string.");
	   else
	   System.out.println(str + " is not a palindrome string.");
}
}
public class PalindromeString
{
	public static void main(String[] args) {
        Palindrome p1 = new Palindrome();
    }
}

