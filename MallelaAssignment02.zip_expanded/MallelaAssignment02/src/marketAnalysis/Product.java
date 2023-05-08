/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketAnalysis;

import java.util.Objects;

/**
 *
 * @author Aishwarya Mallela
 */
public class Product {
    private String productName;
    private String productBrand;

    public Product(String productName, String productBrand){
        //throw new UnsupportedOperationException("Not supported yet!");
        this.productName = productName;
        this.productBrand =  productBrand;
    }

    public String getProductName() {
        //throw new UnsupportedOperationException("Not supported yet!");
    	return productName;
    }

    public String getProductBrand() {
        //throw new UnsupportedOperationException("Not supported yet!");
        return productBrand;
    }
    
    @Override
	public int hashCode() {
		return Objects.hash(productBrand, productName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productBrand, other.productBrand) && Objects.equals(productName, other.productName);
	}

	@Override
    public String toString(){
        //throw new UnsupportedOperationException("Not supported yet!");
    	return productName+"-"+productBrand;
    }
}
