import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.print("Nhập xâu: ");
         String x = s.nextLine();  
         int cnt1 = 0 ;
         int cnt2 =0 ;
         int cnt3 = 0 ;
         for(char ch : x.toCharArray()){
             if(Character.isLetter(ch)){
                 cnt1++;
             }else if(Character.isDigit(ch)){
                 cnt2++;
             }else{
                   cnt3++;  
             }
         }
         System.out.println("So chu cai : " +cnt1);
           System.out.println("So ki tu so : " +cnt2);
             System.out.println("So ki tu dac biet : " +cnt3);
    }
}
