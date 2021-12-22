import java.util.Scanner;

class QuickSort{

    public static void quick_sort(int[] arr, int l , int h){
        if(l < h){
            int pivot = partition(arr , l , h);
            quick_sort(arr , l , pivot - 1);
            quick_sort(arr , pivot + 1 , h);
        }
        
    }

    public static int partition(int[] a , int l , int h){
        int mid = (l + h) / 2;
        int pivot = a[mid];
        int i = l;
        int j = h;
        while(i < j){
            while(a[i] <= pivot) i++;
            while(a[j] > pivot) j--;
            if(i < j) swap(a, i, j);
        }
        swap(a , j , mid);
        return j;
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
        quick_sort(arr , 0 , n - 1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
