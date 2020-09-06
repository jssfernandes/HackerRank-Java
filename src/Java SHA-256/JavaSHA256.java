import java.io.*;
import java.util.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class JavaSHA256 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        try {
            MessageDigest objSHA = MessageDigest.getInstance("SHA-256");
            byte[] bytSHA = objSHA.digest(input.getBytes());
            BigInteger intNumber = new BigInteger(1, bytSHA);
            String strHashCode = intNumber.toString(16);

            // pad with 0 if the hexa digits are less then 64.
            while (strHashCode.length() < 64) {
                strHashCode = "0" + strHashCode;
            }
            System.out.println(strHashCode);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}