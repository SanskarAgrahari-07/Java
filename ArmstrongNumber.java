import java.util.Scanner;
import java.lang.Math;
class armstrong {
	Scanner sc = new Scanner(System.in);
	int n;
	armstrong() {
		System.out.println("Enter the number");
		 n = sc.nextInt();
	}
	void check() {
		int num=0,d,rem;
		 d=n;
	    int count = (int) Math.log10(n) + 1;
	    while(n>0)
	    {
	        rem = n % 10;
	        num+= Math.pow(rem,count);
	       n=n/10;
	    }
	    if(num==d){
	        System.out.println(d + " is an armstrong number.");
	    }
	    else{
	        System.out.println(d + " is not an armstrong number.");
	    }
	}
}
public class ArmstrongNumber
{ 
	public static void main(String[] args) {
	  armstrong a1 = new armstrong();
	  a1.check();
	   
	}
}
