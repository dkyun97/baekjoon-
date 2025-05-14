
import java.util.Scanner;
import java.math.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();  // Scanner 닫기

        BigInteger tempNum = new BigInteger(str,2);
        String result = tempNum.toString(8);
        System.out.println(result);
        
    }
}
