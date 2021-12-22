import java.util.Scanner;

class BubbleSort{

    public static void bubble_sort(int[] arr, int n){
        boolean swapped;
        for(int i = 0; i < n-1; i++){
            swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j+1] < arr[j]){
                    swap(arr , j+1 , j);
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Sc.nextInt();
        }
        bubble_sort(arr , n);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}