/**
 * Created by hoecakenux on 13.12.17.
 */
public class MethodCalls {

    public static void function2() {
        System.out.println("fun fun line 1");
    }

    public static void function1() {
        System.out.println("fun line 1");
        function2();
        System.out.println("fun line 2");
    }

    public static void main(String[] args) {
        System.out.println("main line 1");
        function1();
        System.out.println("main line 2");
    }
}
