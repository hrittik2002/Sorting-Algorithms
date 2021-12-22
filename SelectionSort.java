import java.util.Scanner;

class SelectionSort{

    public static void selection_sort(int[] a, int n){
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(a[j] < a[min]) min = j;
            }
            if(min != i) swap(a , min , i);
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
        selection_sort(arr , n);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}