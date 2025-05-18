import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int j = 0; j < n; j++) {

            String str = scan.next();
            Stack<Character> stack = new Stack<>();
            int flag = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    stack.push('(');
                } else {
                    if (stack.size() == 0 || stack.get(stack.size() - 1) != '(') {
                        System.out.println("NO");
                        flag = 1;
                        break;
                    } else if(stack.get(stack.size()-1) == '(') {
                        stack.pop();
                    }
                }
            }
            if (flag == 0) {
                if (stack.size() > 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
            

        }
    }
}
