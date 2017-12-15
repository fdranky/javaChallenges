/**
 * Created by hoecakenux on 13.12.17.
 */
public class sumOfAllElementsIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4,5},{2,3,4,5,6}};
        int sum = 0;
        for(int i = 0; i < 2; i++) {
            System.out.println(sum);
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("Finished travelling 2D array with sum: " + sum);
    }
}
