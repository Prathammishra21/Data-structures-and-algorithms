public class smallest_num {
    public static void main(String[] args) {
        int arr[]={84,75,91,64,29,93,48,66};
        int min = arr[0];

        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Smallest number is: "+min);
    }
}
