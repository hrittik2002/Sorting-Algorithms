import java.util.Scanner;

class MergeSort{
    public static void merge_sort(int[] a, int l , int r){
        if(l < r){
            int mid = l + (r - l)/2;
            merge_sort(a, l, mid);
            merge_sort(a, mid + 1 , r);
            merge_subarray(a , l , mid , r);
        }
    }

    public static void merge_subarray(int a[] , int l , int mid , int r){
        // Find the size of two subarray
        int n1 = mid - l + 1;
        int n2 = r - mid;
        // create two sub array
        int L[] = new int[n1];
        int R[] = new int[n2];
        // copy data from main array
        for(int i = 0; i < n1; i++){
            L[i] = a[l + i];
        }
        for(int i = 0; i < n2; i++){
            R[i] = a[mid + i + 1];
        }
        // Merge the two subarray
        int i = 0 , j = 0 , k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                a[k] = L[i];
                i++;
            }
            else{
                a[k] = R[j];
                j++;
            }
            k++;
        }
        // copy the remaning elements of L[] or R[] if any
        while(i < n1){
            a[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            a[k] = R[j];
            j++;
            k++;
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
        merge_sort(arr , 0 , n - 1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}