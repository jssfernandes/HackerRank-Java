import java.util.*;
import java.io.*;

class JavaLoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j=1; j<= n; j++) {
                double result = a + Math.pow(2,j) * b;
                System.out.print( ((int)result-b) + " ");
            }
            System.out.println();
        }
        in.close();
    }
}