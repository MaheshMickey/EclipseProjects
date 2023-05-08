/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketAnalysis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Aishwarya Mallela
 */
public class CustomerMappingDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        CustomerMapping inventory = new CustomerMapping();
        /**
         * Read the given input file and populate the inventory using addProduct
         * method.
         */
        Scanner sc = new Scanner(new File("input.txt"));
        String customerName = "";
        while(sc.hasNext()) {
        	String cust = sc.nextLine();
        	if(cust.equals("Customer")) {
        		customerName = sc.nextLine();     		
        	}
        	else {
        		String productName = "";
        		String productBrand = "";
        		String[] product = cust.split("-");
        		productName = product[0];
        		productBrand = product[1];
        		Customer c = new Customer(customerName);
        		Product p = new Product(productName,productBrand);
        		inventory.addProduct(c, p);        		
        	}
        }

 
        System.out.println("All the available brands for the product 'Chips' are:");
        System.out.println(inventory.findAllBrands("Chips"));
        System.out.print("The number of customers who purchased Oreo cookies: ");
        System.out.println(inventory.findNoOfCustomers("Cookies", "Oreo"));
        System.out.println("The customers who purchased Kellogg's products: ");
        System.out.println(inventory.whoPurchasedProduct("Kellogg's"));
        System.out.print("The number of unique products in inventory are: ");
        System.out.println(inventory.getProducts().size());
    
    }
}
