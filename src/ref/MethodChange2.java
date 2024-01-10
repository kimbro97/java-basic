package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10;

        System.out.println(data.value);
        changeReference(data);
        System.out.println(data.value);
    }

    private static void changeReference(Data data) {
        data.value = 20;
    }
}