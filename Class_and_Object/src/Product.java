class Product {
    String productName;
    double price;
    static int totalProducts = 0;
    Product(String n, double p) {
        this.productName = n;
        this.price = p;
        totalProducts++;
    }
    void ProductDetails() {
        System.out.println(productName + " " + price);
    }
    static void TotalProducts() {
        System.out.println(totalProducts);
    }
    public static void main(String[] args) {
        Product p1 = new Product("Phone", 20000);
        Product p2 = new Product("Laptop", 50000);
        p1.ProductDetails();
        p2.ProductDetails();
        Product.TotalProducts();
    }
}
