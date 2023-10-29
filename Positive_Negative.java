import java.util.Scanner;

class Positive {
    int n;

    Positive() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        sc.close(); // Close the Scanner to release resources
    }

    void check() {
        if (n < 0)
            System.out.println(n + " is a negative number");
        else if (n > 0)
            System.out.println(n + " is a positive number");
        else
            System.out.println("The number is Zero");
    }
}

public class Positive_Negative {
    public static void main(String[] args) {
        Positive r1 = new Positive();

        r1.check();
    }
}
