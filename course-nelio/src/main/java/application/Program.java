package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

 class Program {
     
   public static void main(String[] args){
       
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       Product product = new Product();
       System.out.println("Enter product data: ");
       System.out.print("Name: ");
       product.name = sc.nextLine();
       System.out.print("Price: ");
       product.price = sc.nextDouble();
       System.out.print("Quantity in stock: ");
       product.quantity = sc.nextInt();
      
       System.out.println("");
       System.out.println("Product data: " + product.toString());
       
       System.out.println("");
       System.out.print("Enter the number of products to be added in stock: ");
       int added = sc.nextInt();
       product.addProducts(added);
       
       System.out.println("");
       System.out.println("Updated data: " + product.toString());
       
       System.out.println("");
       System.out.print("Enter the number of products to be removed from stock: ");
       int removed = sc.nextInt();
       product.removeProducts(removed);
       
       System.out.println("");
       System.out.println("Updated data: " + product.toString());
       
       sc.close();
        
   }
}
