package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello Exception");
        try{
            ElgibilityCheck.check(6.3);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
