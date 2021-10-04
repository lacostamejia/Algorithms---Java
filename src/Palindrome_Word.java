public class Palindrome_Word {
    public static void main(String[] args) {
        String x = "mom";
        String answer = "";
        for(int i = x.length() - 1 ; i >= 0; i--){
            answer += x.charAt(i);
        }
        if(answer.equals(x)){
            System.out.println(x + " is palindrom because reversed is the same: Reversed: " + answer);
        }
        else{
            System.out.println(x + " is not palindrome because reversed is not the same: Reversed: " + answer);
        }
    }
}
