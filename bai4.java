import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.print("Nhập xâu: ");
         String x = s.nextLine();
         if(isPangram(x)){
             System.out.println("La xau Pangram ");
         }else{
             System.out.println("Khong phai xau Pangram ");
         }
    }
    public static boolean isPangram(String x){
        x = x.toLowerCase();
        boolean[] charSet = new boolean[26];
        for(int i=0 ; i<x.length() ; i++){
            char ch = x.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                 charSet[ch - 'a'] = true;  
            }
        }
        for (boolean isPresent : charSet) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
 
}
