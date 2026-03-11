package BasicInterface;

public class anomanus {
    public static void main(String[] args) {
        singleMethod A=new singleMethod() {
            @Override
            public void m1() {
                System.out.println("Overriding m1 in class anomanus");
            }
        };

        A.m1();
    }
}