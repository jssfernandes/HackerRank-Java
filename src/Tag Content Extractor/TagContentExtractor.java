import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor{
	public static void main(String[] args){

        Pattern pattern = Pattern.compile("<([^>]+)>([^<]+)</\\1>");
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
            Matcher m = pattern.matcher(line);
            int matches = 0;
            while(m.find()) {
                matches++;
                System.out.println(m.group(2));
            }
            if(matches == 0) {
                System.out.println("None");
            }
			
			testCases--;
		}
	}
}
