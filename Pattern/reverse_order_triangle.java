package Pattern;

import java.util.Scanner;

public class reverse_order_triangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter n : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }System.out.println();
        }sc.close();
}
}