package Pattern;

import java.util.Scanner;

public class numberarrow {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n= sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" "+" ");
            }for(int j=1;j<=i;j++){
                if (j==1) {
                    System.out.print((j+i-1)+" ");
            }else{
                System.out.print(" "+" ");
            }      
            }for(int j=1;j<=i;j++){
                if(i-1==j){
                    System.out.print((j+1)+" ");
                }else{
                    System.out.print(" "+" ");
                }   
            }System.out.println();
       }sc.close();
    }
}
