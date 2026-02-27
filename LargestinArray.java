class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = arr[0];
        int length = arr.length;
        for(int i = 0; i < length ; i++){
            if(arr[i]>max){
                max= arr[i];
            }

            }
        
        return max;
    }
}
