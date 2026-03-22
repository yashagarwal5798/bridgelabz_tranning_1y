package MultiLevel_Inheritance.Problem_1;

public class Runner {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder();
        d.orderId = 11;
        d.orderDate = "20-03-2026";
        d.trackingNumber = "TRK123";
        d.deliveryDate = "22-03-2026";

        System.out.println("Order ID: " + d.orderId);
        System.out.println("Order Date: " + d.orderDate);
        System.out.println("Tracking Number: " + d.trackingNumber);
        System.out.println("Delivery Date: " + d.deliveryDate);
        System.out.println("Status: " + d.getOrderStatus());
    }
}
