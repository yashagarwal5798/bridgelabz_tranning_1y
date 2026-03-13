public class MobilePhone {
    private String brand ;
    private String model;
    private double price;
    public MobilePhone(String brand , String model , double price )
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void result()
    {
        System.out.println("Brand"+brand);
        System.out.println("Model"+model);
        System.out.println("price"+price);
    }
}
