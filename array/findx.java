package array;

import java.util.Scanner;

public class findx {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter size of array(n) : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                System.out.print("x found at idx : "+i);
            }
        }sc.close();
    }
}
