/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Customer.Address;
import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    private static int temp=0;
    
    private String restId;
    private String restName;
    private String contactNo;
    private Address address;
    
    private Menu itemList;
    private EmployeeDirectory employeeDirectory;
    private UserAccount restAdmin;
    
    public Restaurant(){
        temp++;
        this.restId= "R"+String.valueOf(temp);
        this.itemList= new Menu();
        this.address= new Address();
    }

    public String getRestName() {
        return restName;
    }

    public void setRestId(String restId) {
        this.restId = restId;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public void setRestAdmin(UserAccount restAdmin) {
        this.restAdmin = restAdmin;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Menu getItemList() {
        return itemList;
    }

    public void setItemList(Menu itemList) {
        this.itemList = itemList;
    }

    public String getRestId() {
        return restId;
    }

    @Override
    public String toString() {
        return this.restName;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccount getRestAdmin() {
        return restAdmin;
    }
    
}
