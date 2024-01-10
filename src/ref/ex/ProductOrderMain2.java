package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[count];
        scanner.nextLine();
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt(); scanner.nextLine(); // 입력 버퍼를 비우기 위한 코드
            orders[i] = createOrder(productName, price, quantity);
        }
        printOrder(orders);
        System.out.println(getTotalAmount(orders));
    }

    private static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    private static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 콜라: " + order.quantity);
        }
    }

    private static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
