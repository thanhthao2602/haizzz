import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
     
        System.out.printf("Nhap so phan tu mang : ");
        int n = s.nextInt();  
        int[]  a = new int[n];
        System.out.printf("Nhap cac phan tu mang : ");
        for(int i=0 ; i< n ; i++){
            a[i] = s.nextInt();
        }
        int q = s.nextInt();
        while(q-- > 0){
            int l  = s.nextInt();
            int r = s.nextInt();
            int sum=0 ; 
            for(int i =0 ; i<r ; i++){
                sum+= a[i];
                
            } System.out.println("Tong cac so tu "+l+" den "+ r +" la : "+ sum);
                    
        }
    }
 
}
