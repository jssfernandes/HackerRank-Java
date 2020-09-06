
import java.io.IOException;
import java.lang.reflect.Method;

class Printer {
   //Write your code here
   public void printArray(Object[] array) {
       for (Object obj : array) {
           System.out.println(obj);
        }
    }
}
/** outro metedo de solucao
class Printer {
   public static < E > void printArray( E[] inputArray ){
       for ( E element : inputArray ){
           System.out.printf( "%s\n", element );
        }
    }
}
*/

public class JavaGenerics {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
                count++;
        }
        if(count > 1)System.out.println("Method overloading is not allowed!");     
    }
}