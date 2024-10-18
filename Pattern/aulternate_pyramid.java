package 
Pattern;

import java.util.Scanner;

public class aulternate_pyramid {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter n : ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>=1;j--){
                System.out.print(" "+" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print((char)(j+64)+" ");
            }for(int j=2;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }sc.close();
  }
}
