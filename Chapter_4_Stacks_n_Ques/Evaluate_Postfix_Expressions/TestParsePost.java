package Chapter_4_Stacks_n_Ques.Evaluate_Postfix_Expressions;
import java.util.Scanner;

public class TestParsePost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        ParsePost parse = new ParsePost(x);
        int result = parse.doParse();
        System.out.println(result);
    }///end main()
}/// end TestParsePost