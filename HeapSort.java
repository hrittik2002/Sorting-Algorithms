import java.util.Scanner;

class HeapSort{

    public static void heap_sort(int[] arr, int n){
        for(int i = (n/2)-1; i >= 0; i--){
            heapify(arr , n , i);
        }
        for(int i = n-1; i > 0; i--){
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }
    public static void heapify(int[] arr, int n , int i){
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        if(l < n && arr[l] > arr[largest]){
            largest = l;
        }
        if(r < n && arr[r] > arr[largest]){
            largest = r;
        }
        if(largest != i){
            swap(arr, i, largest);
            heapify(arr , n , largest);
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
        heap_sort(arr , n);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}