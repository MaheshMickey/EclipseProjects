/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketAnalysis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Aishwarya Mallela
 */
public class CustomerMapping {
     private HashMap<Customer, LinkedList<Product>> marketBasket;
     
    /**
     * No-arg constructor
     */ 
    public CustomerMapping() {
        //throw new UnsupportedOperationException("Not supported yet!");
    	this.marketBasket = new HashMap<>();
    }
    /**
     * Getter method
     * @return marketBasket hashmap
     */
    public HashMap<Customer, LinkedList<Product>> getMarketBasket() {
        //throw new UnsupportedOperationException("Not supported yet!");
    	return marketBasket;
    }

    /**
     *This method add the given product to the customer key of the marketBasket 
     * hashmap. If the customer does not exist, create a new entry in the 
     * marketBasket hashmap.
     * @param customer
     * @param product
     */
    public void addProduct(Customer customer, Product product) {
        //throw new UnsupportedOperationException("Not supported yet!");
    	LinkedList<Product> prod = new LinkedList<Product>();
    	if(marketBasket.containsKey(customer)) {
    		marketBasket.get(customer).add(product);
    	}
    	else {
    		prod.add(product);
    		marketBasket.put(customer, prod);
    	}											
    }
    
    /**
     * This method finds the total number of customers in the marketBasket 
     * hashmap who purchased the given product with given brand.
     * @param productName
     * @param brandName
     * @return total number of the customers
     */
    public int findNoOfCustomers(String productName, String brandName) {
        //throw new UnsupportedOperationException("Not supported yet!");
    	int count = 0;
    	for(Customer customername : marketBasket.keySet()) {
    		LinkedList<Product> productList = marketBasket.get(customername);
    		for(Product prod : productList) {
    			if(prod.getProductName().equals(productName) && prod.getProductBrand().equals(brandName)) {
        			count++;
        		}
    		}	
    	}
    	return count;
    }
    
    
    /**
     * This method finds the customer names those who purchased the products with 
     * the given brandName. 
     * @param brandName
     * @return Set of customer names.
     */
    public Set<String> whoPurchasedProduct(String brandName) {
        //throw new UnsupportedOperationException("Not supported yet!");
    	Set<String> custNames = new TreeSet<String>();
    	for(Customer cust : marketBasket.keySet()) {
    		LinkedList<Product> productList = marketBasket.get(cust);
    		for(Product prod : productList) {
    			if(prod.getProductBrand().equals(brandName)) {
        			custNames.add(cust.getName());
        		}
    		}
    	}
    	return custNames;
    }

    /**
     *This method returns all the unique products in the marketBasket hashmap.
     * @return all the unique products in the marketBasket.
     */
    public List<Product> getProducts() {
        //throw new UnsupportedOperationException("Not supported yet!");
    	List<Product> uniqueProducts = new LinkedList<Product>();
    	Set<Product> uniqueProdSet = new HashSet<Product>();
    	for(Customer cust : marketBasket.keySet()) {
    		LinkedList<Product> productList = marketBasket.get(cust);
    		for(Product prod : productList) {
        		uniqueProdSet.add(prod);
    		}
    	}
    	for(Product prodSet : uniqueProdSet) {
    			uniqueProducts.add(prodSet);
    	}
    	return uniqueProducts;
    }

    /**
     * This method returns all the available brands for a given product.
     * @param productName
     * @return Set of brand names of the given product.
     */
    public Set<String> findAllBrands(String productName) {
        //throw new UnsupportedOperationException("Not supported yet!");
    	Set<String> availableBrands = new TreeSet<String>();
    	for(Customer cust : marketBasket.keySet()) {
    		LinkedList<Product> productList = marketBasket.get(cust);
    		for(Product p : productList) {
    			if(p.getProductName().equals(productName)) {
    				availableBrands.add(p.getProductBrand());
    			} 		 
    		}
    	}
    	return availableBrands;
    }
    
    /**
     * This method returns the size of the marketBasket hashmap.
     * @return the size of the marketBasket
     */
    public int size() {
        //throw new UnsupportedOperationException("Not supported yet!");
    	return marketBasket.size();
    }
}
