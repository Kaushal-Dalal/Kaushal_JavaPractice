package Pattern;
import java.util.Scanner;
public class downarrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n= sc.nextInt();
        
        for(int i=n;i>=1;i--){ //diamond 2 part;
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

