public class avg_array {
    public static void main(String[] args) {
        int arr[]={12,13,23,24,34,35,45,56,67,78};
        int sum = arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        float average = sum/arr.length;
        System.out.println("Average of array is: "+average);
    }
}
