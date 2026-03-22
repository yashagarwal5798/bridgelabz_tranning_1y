package MultiLevel_Inheritance.Problem_1;

public class DeliveredOrder extends ShippeddOrder
{
    String deliveryDate;
    String getOrderStatus()
    {
        return "Order Delivered";
    }
}
