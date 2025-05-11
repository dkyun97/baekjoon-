import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        
        int gcdnum = gcd(a,b);
      

        int numOfA = a / gcdnum;
        int numOfB = b / gcdnum;
        
        int result = gcdnum * numOfA * numOfB;

        System.out.println(gcdnum);
        System.out.println(result);
    }
    public static int gcd(int a,int b){
        if(a % b == 0){
            return b;
        }
        return gcd(b,a%b);
    }
}
