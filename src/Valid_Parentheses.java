public class Valid_Parentheses {
    public static void main(String[] args) {
        String s = "([)]";
        char x = ' ';
        boolean y = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                x = ')';
            }
            else if(s.charAt(i) == '['){
                x = ']';
            }
            else if(s.charAt(i) == '{' && s.charAt(i+1) == '('){
                x = '}';
            }
            else{
                y = false;
            }
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(j) == x){
                    y = true;
                }
                else{
                    y = false;
                }
            }
        }
        System.out.println(y);
    }
}
