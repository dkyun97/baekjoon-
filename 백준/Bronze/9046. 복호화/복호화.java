import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();

        for(int i = 0;i < N ; i++){

            int[] alphabet = new int[26];
            String str = scan.nextLine();

            for(int j = 0;j < str.length();j++){
                if(str.charAt(j) != ' '){
                    alphabet[str.charAt(j) -'a'] += 1;
                }
            }
            //max idx ?
            int maxIdx = 0;
            int value = 0;
            for(int k = 0;k < 26;k++){
                if(alphabet[k] >= value){
                    value = alphabet[k];
                    maxIdx = k;
                }
            }
            int cnt = 0;
            for(int z = 0;z < 26;z++){
                if(alphabet[z] >= value){
                    cnt += 1;
                }
            }
            if(cnt == 1){
                
                System.out.println((char)(maxIdx + 'a'));
            }
            else{
                System.out.println('?');
            }
        }
    }
}
