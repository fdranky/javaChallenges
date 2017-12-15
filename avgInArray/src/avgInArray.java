/**
 * Created by hoecakenux on 13.12.17.
 */
public class avgInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5,20,3,41,52};
        //if the array would be ordered starting from 1, we could get avg with a one line function
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum / arr.length);
    }
}
