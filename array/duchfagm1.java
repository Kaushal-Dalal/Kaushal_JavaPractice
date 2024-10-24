package array;

public class duchfagm1 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,1,0,0,1,0,2,2,1,0,1};
        int n = arr.length;
       int noOfZeroes = 0;
       int noOfOnes = 0;
       for(int i=0;i<n;i++){
          if(arr[i]==0){
            noOfZeroes++;
          }if(arr[i]==1){
            noOfOnes++;
          }
       }
       for(int i=0;i<n;i++){
        if(i<noOfZeroes){
            arr[i] = 0;
        }else if(i<noOfZeroes+noOfOnes){
            arr[i] = 1;
        }else{
            arr[i] = 2;
        }
       }
       for(int ele : arr){
        System.out.print(ele+" ");
       }
    } 
}
