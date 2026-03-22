package MultiLevel_Inheritance.Problem_1;

public class ShippeddOrder extends Order {
    String trackingNumber;
    String getOrderStatus() {
        return "Order Shipped";
    }
}
