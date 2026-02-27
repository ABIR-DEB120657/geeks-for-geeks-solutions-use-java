class Solution {
    public int search(int arr[], int x) {
        // code here
        //int x ;
        // int index = 0;
        int length = arr.length;
        for(int i = 0; i < length ; i++){
            //index = i;
            if(arr[i]==x){
                return i;
            }
        }
                return -1;
            
        
    }
}
