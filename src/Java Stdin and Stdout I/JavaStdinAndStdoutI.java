import java.util.*;

public class JavaStdinAndStdoutI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int a = scan.nextInt();
            System.out.println(a);
        }
    }
}
