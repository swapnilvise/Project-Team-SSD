/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Customer {
    private static int temp=10000;
    
    private String custId;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private String emailId;
    
    private Address address;
    private UserAccount customerAccount;

    public Customer() {
        temp++;
        this.custId= "C"+String.valueOf(temp);
        this.customerAccount= new UserAccount();
        this.address= new Address();
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address Address) {
        this.address = Address;
    }

    public UserAccount getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(UserAccount customerAccount) {
        this.customerAccount = customerAccount;
    }
    
}
