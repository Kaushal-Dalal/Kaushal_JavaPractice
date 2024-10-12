package Pattern;
public class practice {
   public static void main(String[] args) {
    int[] arr = {1,2,3,9,4,2,4};
    int n =arr.length;
    int[] ans = new int[n];
    ans[n-1] = -1;
    int mx = 0;
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
           if(mx<arr[j]){
            int temp = mx;
            mx = arr[j];
            arr[j] = temp;
           }
           
        }
        ans[i] = mx;
    }
    for(int ele : ans){
        System.out.print(ele+" ");
    }
   }   
}