import java.util.Scanner;

class Product {
    private String productName;
    private double price;
    private int stockQuantity;

    // Constructor
    public Product(String productName, double price, int stockQuantity) {
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Method to purchase a product
    public void purchaseProduct(int quantity) {
        if (quantity <= stockQuantity) {
            stockQuantity -= quantity;
            double totalPrice = quantity * price;
            System.out.println("Purchase successful! Total Price: $" + totalPrice);
        } else {
            System.out.println("Insufficient stock available.");
        }
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating two products with user input
        System.out.print("Enter first product name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter first product price: ");
        double price1 = scanner.nextDouble();
        System.out.print("Enter first product stock quantity: ");
        int stock1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product product1 = new Product(name1, price1, stock1);

        System.out.print("Enter second product name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter second product price: ");
        double price2 = scanner.nextDouble();
        System.out.print("Enter second product stock quantity: ");
        int stock2 = scanner.nextInt();

        Product product2 = new Product(name2, price2, stock2);

        // Displaying product details
        System.out.println("\nProduct Details:");
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Purchasing a product
        System.out.print("\nEnter quantity to purchase from first product: ");
        int purchaseQty = scanner.nextInt();
        product1.purchaseProduct(purchaseQty);

        // Display updated details
        System.out.println("\nUpdated Product Details:");
        product1.displayProductDetails();
        product2.displayProductDetails();

        scanner.close();
    }
}
