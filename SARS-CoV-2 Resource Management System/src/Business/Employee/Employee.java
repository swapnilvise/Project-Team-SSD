/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private static int temp=0;
    
    private String name;
    private String empId;
    private static int count = 1;
    private UserAccount userAccount;

    public Employee() {
        temp++;
        this.empId= "E"+String.valueOf(temp);
    }
    
    public String getEmpId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
