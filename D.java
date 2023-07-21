import java.util.*;
public class D {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(searchN(s));
    }


    
    public static int searchN(String s) {
        int[] charCount = new int[26];    
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1; 
