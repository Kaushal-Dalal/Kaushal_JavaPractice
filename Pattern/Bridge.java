package Pattern;

import java.util.Scanner;

public class Bridge {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter n : ");
        int n = sc.nextInt();
       
       for(int i=1;i<=2*n-1;i++){
        System.out.print((char)(i+64)+" ");
       }System.out.println();
       for(int i=1;i<=n;i++){
        int a =1;
        for(int j=n-i;j>=1;j--){
            System.out.print((char)((a++)+64)+" ");
        }for(int j=1;j<=2*i-1;j++){
            System.out.print(" "+" ");a++;
        } for(int j=n-i;j>=1;j--){
            System.out.print((char)((a++)+64)+" ");
        }System.out.println();
       }sc.close();
}
}
