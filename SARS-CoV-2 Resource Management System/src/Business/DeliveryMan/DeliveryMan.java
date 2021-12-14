/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Customer.Address;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private static int temp=50000;
    
    private String delId;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private String emailId;
    
    private Address address;
    private UserAccount deliveryManAccount;
    
    public DeliveryMan() {
        temp++;
        this.delId= "D"+String.valueOf(temp);
        this.address= new Address();
//        this.deliveryManAccount= new UserAccount();
    }

    public String getDelId() {
        return delId;
    }

    public void setDelId(String delId) {
        this.delId = delId;
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
        return address;
    }

    public void setAddress(Address Address) {
        this.address = Address;
    }

    public UserAccount getDeliveryManAccount() {
        return deliveryManAccount;
    }

    public void setDeliveryManAccount(UserAccount deliveryManAccount) {
        this.deliveryManAccount = deliveryManAccount;
    }

    @Override
    public String toString() {
        return this.firstName;
    }
    
}
