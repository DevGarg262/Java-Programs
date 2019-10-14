import java.util.Scanner;

public class binarysearch {

    public static int searchnear(int[] arr, int data) {
        int si = 0;
        int ei = arr.length - 1;

        if (data < arr[0]) {
            return arr[0];
        } else if (data > arr[arr.length - 1]) {
            return arr[arr.length - 1];
        } else {
            while (si <= ei) {
                int mid = ((si + ei) / 2);
                if (arr[mid] == data) {
                    System.out.println("index " + mid);
                    return mid;
                }

                else if (arr[mid] < data) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }

            }
            if (data - arr[ei] <= arr[si] - data) {
                return arr[ei];
            } else {
                return arr[si];
            }
        }
        // return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number :  ");
        int data = sc.nextInt();
        // int[] arr= new int[13] ;
        int[] arr = { 2, 5, 8, 8, 8, 8, 8, 8, 8, 20, 40, 67, 89, 92 };
        System.out.print(searchnear(arr, data));
    }
}
