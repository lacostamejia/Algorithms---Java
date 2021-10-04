//Working


public class Palindrome_Number {
    public static void main(String[] args) {
        int x = -121;
        String s = String.valueOf(x);
        String answer = "";
        for(int i = s.length() - 1; i >= 0 ; i--){
            answer += s.charAt(i);
        }
        if(answer.equals(s)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
