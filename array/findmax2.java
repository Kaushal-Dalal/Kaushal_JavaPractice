package array;

public class findmax2 {
    public static void main(String[] args) {
    
        int[] arr = {3,1,9,5};
        int max = arr[0];
        int max2 = arr[0];
        for(int i=0;i<arr.length;i++){
          if(arr[i] > max ){
            int temp = arr[i];
            arr[i] = max;
            max = temp;
          } 
        }
         for(int i=0;i<arr.length;i++){
            if(arr[i] > max2 && max2 < max){
                int temp = arr[i];
                arr[i] = max2;
                max2 = temp;
            }
         }System.out.print(max2);
    }
}
