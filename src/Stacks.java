import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> games = new Stack<String>();

        games.add("Call of Duty");
        games.add("Forza");
        games.add("Need for Speed");

        System.out.println(games);
        System.out.println(games.peek()); //Print the top item
        games.push("Habbo"); //Add a new value to the top
        System.out.println(games.peek());
        games.pop(); //Remove the top Item
        System.out.println(games);

    }
}
