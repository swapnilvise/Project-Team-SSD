/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabTests;

import Business.Student.Student;
import java.util.HashMap;

/**
 *
 * @author swapn
 */
public class LabTestDirectory {
    
    private HashMap<String, LabTestsPrescribedByDocotor> LabTestList;

    public LabTestDirectory() {
        this.LabTestList=new HashMap<>();
    }
    
    //Find customer using customer id
    public LabTestsPrescribedByDocotor findLabTest(String TestID){
        LabTestsPrescribedByDocotor test = this.LabTestList.get(TestID);
        if(test==null)
            return null;
        return test;
    }

    public HashMap<String, LabTestsPrescribedByDocotor> getLabTestList() {
        return LabTestList;
    }
    
    //Creating new customer
    public LabTestsPrescribedByDocotor newTest(){
        LabTestsPrescribedByDocotor test = new LabTestsPrescribedByDocotor();
        this.LabTestList.put(test.getTestID(), test);
        return this.LabTestList.get(test.getTestID());
//        return c;
    }
    
    //Removing customer
    public void removeTest(String TestID){
        this.LabTestList.remove(this.LabTestList.get(TestID));
    }
    
}
