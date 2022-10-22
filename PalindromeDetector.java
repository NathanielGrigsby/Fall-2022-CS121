import java.util.Scanner;

public class PalindromeDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word");
        String word = scanner.nextLine();
        boolean result = palindromeDetector(word);
        System.out.println(result);
    }
    public static boolean palindromeDetector(String w){
        String wordReverse = "";
        int T = 0;
        for(int i = w.length() - 1; i>=0; i--){
            wordReverse = wordReverse + w.charAt(i);

        }
        if(w.length() == 0 || w.length() == 1){
            return true;
        }if(w.charAt(0) == wordReverse.charAt(0)){
            return palindromeDetector(w.substring(1, w.length() - 1));
        }return false;
    }
}
