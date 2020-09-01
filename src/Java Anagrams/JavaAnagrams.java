import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()){
            return false;
        }

        char[] s1 = a.toLowerCase().toCharArray();
        char[] s2 = b.toLowerCase().toCharArray();
        boolean anagram = true;
        java.util.Arrays.sort(s1);
        java.util.Arrays.sort(s2);
        
        for(int i = 0; i < s1.length; i++) {
            if(s1[i] != s2[i]) {
                anagram = false;
            }
        }
        return anagram;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
