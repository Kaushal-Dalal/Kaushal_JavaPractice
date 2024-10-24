package array;
public class array {
  public static void main(String[] args) { 
   int[] arr = {1,2,3,4,5,6};
   int n = arr.length;
      for(int ele : arr){
        System.out.print(ele+" ");
      }System.out.println();
      int j = n-1;
      for(int i=0;i<=j;i++){
       int temp = arr[i];
       arr[i]  =arr[j];
       arr[j] = temp;
       j--;
      }
      for(int ele : arr){
        System.out.print(ele+" ");
      }
  }
 }
      

