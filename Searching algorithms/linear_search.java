package Searching;

class linear_search {
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56,67,78,89,90};
        int target = 56;
        boolean found =false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(target+" found at index "+i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found!");
        }
    }
}
