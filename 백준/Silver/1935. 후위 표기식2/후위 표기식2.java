import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String str = scan.next();

        Double[] arr = new Double[26];

        for(int i = 0;i < n ; i ++){
            int num = scan.nextInt();
            arr[i] = (double) num;
        }

        Stack<Double> stack = new Stack<>();
        
        for(int i = 0;i < str.length(); i++){
            if(str.charAt(i) - 65 >= 0 && str.charAt(i) - 65 <= 25){
                stack.push(arr[str.charAt(i) - 65]);
            }
            else{
                Double back = stack.pop();
                Double front = stack.pop();

                if(str.charAt(i) == '+'){
                    front += back;
                }
                else if(str.charAt(i) == '-'){
                    front -= back;
                }
                else if(str.charAt(i) == '*'){
                    front *= back;
                }
                else if(str.charAt(i) == '/'){
                    front /= back;
                }
                stack.push(front);
            }
        }
        Double result = stack.pop();
        System.out.printf("%.2f%n",result);

        
    }
}
