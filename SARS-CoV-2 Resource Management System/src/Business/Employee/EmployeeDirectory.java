/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private HashMap<String,Employee> employeeList;

    public EmployeeDirectory() {
        this.employeeList = new HashMap();
    }

    public HashMap<String,Employee> getEmployeeList() {
        return this.employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        this.employeeList.put(employee.getEmpId(),employee);
        return this.employeeList.get(employee.getEmpId());
    }
    
    public void removeEmployee(String empId){
        this.employeeList.remove(empId);
    }
    
    public Employee findEmployeeByUserName(String userName){
        
        for(String s: this.employeeList.keySet()){
            if(this.employeeList.get(s).getUserAccount().getUsername().equals(userName)){
                return this.employeeList.get(s);
            }
        }
        return null;
    }
    
    public Employee findEmployee(String empId){
        
        for(String s: this.employeeList.keySet()){
            if(this.employeeList.get(s).getEmpId().equals(empId)){
                return this.employeeList.get(s);
            }
        }
        return null;
    }
}