package Pattern;
import java.util.Scanner;
public class hollowdiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" "+" ");
            }for(int j=1;j<=i;j++){
                if (j==1 || j==i ) {
                    System.out.print("*"+" ");
            }else{
                System.out.print(" "+" ");
            }      
            }for(int j=1;j<=i-1;j++){
                if(i-1==j || j==n-j+i){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }   
            }System.out.println();
        }for(int i=1;i<=2*n-1;i++){
            System.out.print("*"+" ");
        }
        for(int i=1;i<=1;i++){
            for(int j=1;j<=n+1;j++){
            System.out.print(" "+" ");
        }System.out.println();
    }
        for(int i=n;i>=0;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" "+" ");
            }for(int j=1;j<=i;j++){
                if(j==1 || j==i){
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
