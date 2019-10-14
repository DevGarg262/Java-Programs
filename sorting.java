public class sorting {

    public static void bubblesort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {,
                    swap(arr, j - 1, j);
                    flag = true;
                }
            }

            System.out.print(arr[i] + "  ");
            if (flag == false) {
                break;
            }
        }
        System.out.println();
    }


    public static void selectsort(int[] arr, int n) {
int nos = 0 //total number os swaps
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if (arr[i] > arr[j]) {                                                                                                
                    swap(arr, j, j);
                    nos++ ;4 m
                    
                }
            }

            System.out.print( arr[i] + "   ");
        }
        System.out.print(nos);//to print total no of swaps used in the sorting
    }


public static void swap(int[] arr ,int a,int b){
    int temp =arr[a];
   arr[a]  = arr[b];
    arr[b] = temp ;
}
    public static void main(String[] args) {

        int[] arr = { 2, 5, 8, 7, 34, 12, 20, 40, 67, 89, 92 };
        int n = arr.length;
        bubblesort(arr, n);
        selectsort(arr, n);
    }
}