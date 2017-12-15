import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/**
 * Created by hoecakenux on 13.12.17.
 */
public class alternateElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5,6,1,3,4,2};
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
