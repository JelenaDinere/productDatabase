import dataBase.DBHandler;
import products.Product;
import products.ProductController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ProductController productController = new ProductController();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println( "Enter the id of product" );
//        int id = scanner.nextInt();
//
//        Product product = productController.findProduct(id);
//        product.name ="cream";
//        product.quantity = 20;
//        product.price = 3.20f;
//        productController.updateProduct(product);
ProductController productController = new ProductController();

Scanner scanner = new Scanner(System.in);
 System.out.println( "Enter the id of product" );
int id = scanner.nextInt();
productController.deleteProduct(id);
    }
}
