import java.util.Scanner;

class InsertionSort{

    public static void insersion_sort(int[] a, int n){
        for(int j = 1; j < n; j++){
            int temp = a[j];
            int i = j - 1;
            while(i >= 0 && a[i] > temp){
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = temp;
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
        insersion_sort(arr , n);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}