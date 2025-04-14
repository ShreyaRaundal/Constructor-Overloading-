public class ProductDriver {
    public static void main(String[] args){
        Product p1=new Product("Mouse", 499.0);
        Product p2=new Product("Keyboard",999.0,"Eletronics");
        Product p3=new Product("T-shirt",250,"Clothing",50);

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

    }
}
