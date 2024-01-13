package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticCall();
    }

    private void instanceMethod() {
        System.out.println(instanceValue);
    }

    private static void staticMethod() {
        System.out.println(staticValue);
    }
}
