package Pattern;

import java.util.Scanner;

public class holowdiamond {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n= sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=n-i;j>=1;j--){
            System.out.print(" "+" ");
        }for(int j=1;j<=i;j++){
            if (j==1) {
                System.out.print("*"+" ");
        }else{
            System.out.print(" "+" ");
        }      
        }for(int j=1;j<=i-1;j++){
            if(i-1==j){
                System.out.print("*"+" ");
            }else{
                System.out.print(" "+" ");
            }   
        }System.out.println();
    }for(int i=n-1;i>=1;i--){
        for(int j=n-i;j>=1;j--){
            System.out.print(" "+" ");
        }for(int j=1;j<=i;j++){
            if(j==1){
            System.out.print("*"+" ");   
            }else{
                System.out.print(" "+" ");
            }
        }for(int j=1;j<=i-1;j++){
         if(i-1==j){
                System.out.print("*"+" ");
            }else{
                System.out.print(" "+" ");
            }   
        }System.out.println();
    }sc.close();
}

}
