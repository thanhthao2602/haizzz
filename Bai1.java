
package bai1;

import java.util.Scanner;
public class Bai1 {

 
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int[] cnt = new int[10000];
      
       int n = s.nextInt();
       int[] a = new int[n];
        System.out.println("Nhap cac phan tu mang : ");
       for(int i=0 ; i< n ; i++){
           a[i]= s.nextInt();
       }
       for(int i=0 ; i< n ; i++){
           cnt[a[i]] ++;
       }
       int dem=0 , m = 0;
       
       for(int i=0 ; i<n ; i++){
          
           if(cnt[a[i]] >dem){
               dem = cnt[a[i]];
                m = a[i];
           }
           else if(cnt[a[i]]==dem){

        if( m > a[i]){
                    m = a[i];
               }
                  
           }
       }  
        System.out.println(m +" "+ dem);
    }
    
}
