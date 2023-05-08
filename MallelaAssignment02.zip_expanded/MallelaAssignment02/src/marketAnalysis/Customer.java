/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketAnalysis;

/**
 *
 * @author Aishwarya Mallela
 */
public class Customer {
    private String name;
    
    public Customer(String name){
        //throw new UnsupportedOperationException("Not supported yet!");
        this.name = name;
        
    }

	public String getName() {
        //throw new UnsupportedOperationException("Not supported yet!");
        return name;
        
    }
    
    @Override
    public String toString(){
        //throw new UnsupportedOperationException("Not supported yet!");
        return name;
    }
    
    
}
