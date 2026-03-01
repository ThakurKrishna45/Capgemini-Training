package ExceptionHandling;

public class ElgibilityCheck{
   public static void check(double cgpa) throws IneligibleException{
       if(cgpa<7.5)throw new IneligibleException("Less CGPA");
   }
}
