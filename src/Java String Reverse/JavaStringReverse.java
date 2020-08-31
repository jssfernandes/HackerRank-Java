import java.io.*;
import java.util.*;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        StringBuilder stringReverse = new StringBuilder();
        stringReverse.append(A); 
        stringReverse = stringReverse.reverse(); 
        
        System.out.println(A.equals(stringReverse.toString()) == true ? "Yes" : "No");
    }
}