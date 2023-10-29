import java.util.Scanner;
class Student{
    Scanner sc  =  new Scanner(System.in);
    public
    String name;
    int age;
    int salary;
    Student() {
        System.out.println("Enter the name");
        name = sc.next();
        System.out.println("Enter the age");
        age = sc.nextInt();
        System.out.println("Enter your salary");
        salary = sc.nextInt();
    }
    void disp()
    {
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your salary is " + salary);
    }
    
}

public class Array_Of_Objects {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number of students");
        n = obj.nextInt();
        Student[] std = new Student[n];
        for(i=0;i<n;i++)
        {
            std[i] = new Student();
        }
        for(i=0;i<n;i++)
        {
            std[i].disp();
        }
    }
}
