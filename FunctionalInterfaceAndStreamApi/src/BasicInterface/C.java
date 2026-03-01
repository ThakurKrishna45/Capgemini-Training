package BasicInterface;

public class C implements A{
    @Override
    public void m1() {
        System.out.println("CM1");
    }

    @Override
    public void m2() {
        System.out.println("CM2");
    }

    @Override
    public void m3() {
        System.out.println("CM3");
    }
    @Override
    public void m4(){
        System.out.print("CM4");
    }
}
