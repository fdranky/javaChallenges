/**
 * Created by hoecakenux on 13.12.17.
 */
public class BinarySearchRecursive {

    public static int binarySearch(int arr[], int low, int high, int value) {
        int mid = low + (high - low) / 2;
        if(mid == value) {
            return mid;
        } else if(arr[mid] < value) {
            return binarySearch(arr, mid + 1, high, value);
        } else {
            return binarySearch(arr, low, mid - 1, value);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(binarySearch(arr, 1, 3, 2));
    }
}
