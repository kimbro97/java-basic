package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();
//        poly.childMethod();
        // 다운캐스팅
        Child child = (Child) poly;
        child.childMethod();

        // 일시적인 다운캐스팅
        ((Child) poly).childMethod();
    }
}
