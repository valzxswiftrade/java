import java.io.IOException;

public class THROWTHROWS {
public void myMethod()throws IOException //ArithmeticException
{
//throw new ArithmeticException("Arithmetic Exception Occured");
throw new IOException("something happen");
}
public static void main(String[] args)throws IOException {
// try {
new THROWTHROWS().myMethod();
// }catch(IOException ae){
// System.out.println(ae.getClass().getCanonicalName());
// }
}

    
}
