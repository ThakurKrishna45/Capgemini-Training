package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try{
            ElgibilityCheck.check(6.3);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
