public class binary_search {
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56,67,78,89,91};
        int target =78;
        int left =0,right=arr.length-1;
        boolean found = false;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                System.out.println("Element found at index: "+mid);
                found=true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
            if(!found){
                System.out.println("Element not found in the array...");
            }
        }
       
    }
}
