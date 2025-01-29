class largest_num{
    public static void main(String[] args) {
        int arr[]={23,21,92,45,108,238};
        int max = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
    }
        System.out.println("Largest number is: "+max);
    }
}