/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.HashMap;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
     private HashMap<String, Customer> customerList;

    public CustomerDirectory() {
        this.customerList=new HashMap<>();
    }
    
    //Find customer using customer id
    public Customer findCustomer(String custID){
        Customer c = this.customerList.get(custID);
        if(c==null)
            return null;
        return c;
    }

    public HashMap<String, Customer> getCustomerList() {
        return customerList;
    }
    
    //Creating new customer
    public Customer newCustomer(){
        Customer c = new Customer();
        this.customerList.put(c.getCustId(), c);
        return this.customerList.get(c.getCustId());
//        return c;
    }
    
    public Customer findCustomerByUserName(String userName){
        
        for(String s: this.customerList.keySet()){
            if(this.customerList.get(s).getCustomerAccount().getUsername().equals(userName)){
                System.out.println("Not null");
                return this.customerList.get(s);
            }
        }
        return null;
    }
    
    //Removing customer
    public void removeCustomer(String custID){
        this.customerList.remove(this.customerList.get(custID));
    }
    
}
