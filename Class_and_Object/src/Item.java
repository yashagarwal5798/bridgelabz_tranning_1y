public class Item {
    private int itemcode ;
    private String itemName;
    private double price;
    public Item(int itemcode, String itemName, double price ){
        this.itemcode = itemcode;
        this.itemName = itemName;
        this.price = price;

    }
    public double totalcost(int quantity){
        return price * quantity;
    }
    public void result(int quantity){
        System.out.println("item code "+itemcode );
        System.out.println("item Name "+itemName);
        System.out.println("price per item:"+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("total cost: "+ totalcost(quantity));
    }


}
