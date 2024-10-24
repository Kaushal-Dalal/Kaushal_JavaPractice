package array;

public class duchflag2 {
    public static void main(String[] args) {
        int[] arr = {1,2,0,2,2,1,0,1,0,0,0,1,2,2};
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
       while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
