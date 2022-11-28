package org.sda.java19;

import org.sda.java19.exeptions.WarehouseNotFoundException;
import org.sda.java19.models.Product;
import org.sda.java19.models.ProductCategory;
import org.sda.java19.models.Warehouse;
import org.sda.java19.services.ProductService;
import org.sda.java19.services.WarehouseService;
import org.sda.java19.services.implementation.ProductServiceImpl;
import org.sda.java19.services.implementation.WarehouseServiceImpl;
import org.sda.java19.util.Data;

import java.math.BigDecimal;
import java.util.*;

/**
 * 2. Warehouse
 * a. User should be able to: add, display all of the details, update, delete an item
 * b. Use composition and collections (The warehouse has products/items)
 * c. Add possibility to display summaries, like sum of all of the products, their prices.
 * d. *Add possibility to update number of items in a specific way, e.g.:
 * “pliers:30”
 * “scissors:+4”
 */
public class Main {

    public static void main(String[] args) throws WarehouseNotFoundException {
        /*
        1. Create Warehouse, Product, ProductCategory (enum), Currency (enum) - models package
        2. Warehouse : name, List of Product, address, isActive
        3. Product: name, pricePerItem, quantity, product category, currency, isAvailable
        4. Create Warehouse object, Before create list of products.
        5. In main method, switch case for various operations.
        6. For each operation, call service method and do the operation
         */

        WarehouseService warehouseService = new WarehouseServiceImpl();
        Scanner scanner = new Scanner(System.in);

        //Initializing the warehouse
        Warehouse warehouse = new Warehouse();
        warehouse.setName("ABC E-POOD");
        warehouse.setAddress("Tallinn");
        warehouse.setActive(true);
        warehouse.setProducts(Data.getInitialProducts());

        warehouseService.addWarehouse(warehouse); // Adds new warehouse

        productOperations();
    }

    private static void productOperations() throws WarehouseNotFoundException {
        ProductService productService = new ProductServiceImpl();

        int displayMenu = warehouseMenu();


        switch (displayMenu) {
            case 0: // add product
                productService.addProduct(addProduct());
                break;
            case 1: // update product
                productService.updateProduct(updateProduct());
                break;
            case 2: // display products
                productService.getAllProducts();
                break;
            case 3: // delete product
                productService.deleteProductByName(getAllProducts());
                break;
            case 4: // exit warehouse
                break;
            default:
                System.out.println("Incorrect option, use the correct one!");
        }
    }

    private static String getAllProducts() throws WarehouseNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Products in the warehouse:");
        ProductServiceImpl productService = new ProductServiceImpl();

        return productService.getAllProducts().toString();
    }


    private static int getOption(int limit) {
        // User should be able to: add, display all of the details, update, delete an item


        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect option! Please enter again: ";
        int option = limit + 1;

        do {
            if (!scanner.hasNextInt()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                option = scanner.nextInt();

                if (option > limit) {
                    System.out.println(errorMessage);
                }
            }
        } while (option > limit);

        return option;
    }


    private static Product addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the details of the product:");
        System.out.println("Product name:");
        String productName = scanner.next();
        System.out.println("Product price:");
        float price = scanner.nextFloat();
        System.out.println("Choose a product category: " + Arrays.toString(ProductCategory.values()));
        ProductCategory productCategory = ProductCategory.valueOf(scanner.next());


        Product product = new Product();
        product.setName(productName);
        product.setPrice(BigDecimal.valueOf(price));
        product.setProductCategory(productCategory);

        return product;
    }

    private static Product updateProduct() throws WarehouseNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Warehouse products:");

        ProductServiceImpl productService = new ProductServiceImpl();
        System.out.println("Choose a product: update or add another one: ");
        System.out.println(productService.getAllProducts());


        Product product = new Product();
        if (product.getName().equals(scanner.next())) {
            product.setName(scanner.next());
            product.setQuantity(scanner.nextFloat());
            product.setPrice(BigDecimal.valueOf(scanner.nextLong()));
            product.setProductCategory(ProductCategory.valueOf(scanner.next()));
        }
        return (Product) List.of(product);
    }

    private static String deleteProductByName() throws WarehouseNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product to delete:");
        String productName = scanner.next();

        return productName;
    }
    private static int warehouseMenu() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("------MENU-----");
        System.out.println("---------------");

        List<String> warehouseMenu = List.of("Add a product", "Delete a product", "Update product list", "Display all products", "Exit");

        for (int i = 0; i < warehouseMenu.size(); i++) {
            System.out.println(i + 1 + ". " + warehouseMenu.get(i));
        }
        System.out.println("Choose an option from above: ");
        return scanner.nextInt();

    }


}
