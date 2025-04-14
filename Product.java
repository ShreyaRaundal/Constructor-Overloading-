public class Product {
    String name;
    double price;
    String categories;
    int quality;

    // Constructor 1:only name and Price
    Product(String name,double price){
        this.name=name;
        this.price=price;
        this.categories="General";
        this.quality=0;
    }

    // Constaructor 2: name ,price  and categories
    Product(String name,double price,String categories){
        this.name=name;
        this.price=price;
        this.categories=categories;
        this.quality=0;
    } 
    // Constrauctor 3 :All details
    Product(String name,double price,String categories,int quality){
        this.name=name;
        this.price=price;
        this.categories=categories;
        this.quality=quality;
    }
    void displayProduct(){
        System.out.println("Name:"+name);
        System.out.println("Price: "+price);
        System.out.println("Categories: "+categories);
        System.out.println("Quality: "+quality);
        System.out.println("-------------------------------------------------------------------------");
    }

}
