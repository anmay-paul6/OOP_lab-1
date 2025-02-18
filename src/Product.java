
import java.util.Scanner;

public class Product {
    private String productName;
    private double price;
    private int stockQuantity;
    
    public  Product(String productName, double price, int stockQuantity) {
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    public void purchaseProduct(int quantity) {
        if (quantity <= stockQuantity) {
            stockQuantity -= quantity;
            double totalPrice = quantity * price;
            System.out.println("Purchase successful! Total Price: $" + totalPrice);
        } else {
            System.out.println("Insufficient stock available.");
        }
}
public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Stock Quantity: " + stockQuantity);

}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // input
        System.out.print("Enter first product name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter first product price: ");
        double price1 = scanner.nextDouble();
        System.out.print("Enter first product stock quantity: ");
        int stock1 = scanner.nextInt();
scanner.nextLine(); 
        Product product1 = new Product(name1, price1, stock1);

        System.out.print("Enter second product name: ");
      String name2 =scanner.nextLine();
        System.out.print("Enter second product price: ");
        double price2 = scanner.nextDouble();
        System.out.print("Enter second product stock quantity: ");
        int stock2 = scanner.nextInt();

        Product product2 = new Product(name2, price2, stock2);

  
        System.out.println("\nProduct Details:");
        product1.displayProductDetails();
        product2.displayProductDetails();

        // purchasing
        System.out.println("\nWhich Product you want to purchase \n (1) for Product1 \n (2) for Product2 ");
        int q = scanner.nextInt();
        if(q == 1){
             System.out.print("\nEnter quantity to purchase from first product: ");
        int purchaseQty = scanner.nextInt();
        product1.purchaseProduct(purchaseQty);
        }
        else
        {
             System.out.print("\nEnter quantity to purchase from Second product: ");
        int purchaseQty = scanner.nextInt();
        product2.purchaseProduct(purchaseQty);
        }
        
       

        //updated details
        System.out.println("\nUpdated Product Details:");
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}
