package poly.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        String patOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(patOption1, amount1);
        String patOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(patOption2, amount2);
        String patOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(patOption3, amount3);
    }
}
