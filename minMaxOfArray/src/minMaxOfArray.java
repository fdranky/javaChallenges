/**
 * Created by hoecakenux on 13.12.17.
 */
public class minMaxOfArray {

    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int secondMax(int[] arr) {
        int max = maxOfArray(arr);
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max > arr[i] && temp < arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,8,3,4,5,6,7};
        System.out.println(minOfArray(arr) + " : " + secondMax(arr) + " : " + maxOfArray(arr));
    }
}
