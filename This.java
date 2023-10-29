class check {
    void disp1() {
        System.out.print("MY name is ");
    }

    void disp2() {
        this.disp1();
        System.out.println("Sanskar Agrahari");
    }
}

public class This {
    public static void main(String[] args) {
        // check obj = new check();
        // check obj1 = new check("Python");
        // obj.disp();
        // obj1.disp();
        check obj = new check();
        obj.disp2();
    }
}
