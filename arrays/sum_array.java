public class sum_array {
    public static void main(String[] args) {
        int arr[]={23,34,45,56,67,78,89,81};
        int sum= arr[0];

        for(int i =0; i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of elements is: "+sum);
    }
}
