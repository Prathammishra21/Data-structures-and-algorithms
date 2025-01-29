import java.util.Scanner;

public class search_array {
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56,67,78,89,90};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want: ");
        int target = sc.nextInt();
        boolean found = false;
        for(int i =0;i<arr.length;i++){
             if(arr[i]==target){
                found=true;
                break;
        }
    }
    if(found){System.out.println(target+" is the element searched.");}
    else{
    System.out.println("Element not found!");
}
}
}
