/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabTests;

/**
 *
 * @author swapn
 */
public class LabTestsPrescribedByDocotor {
    private String TestID;
    private String TestName;
    private String PrescribedDate;
    private String Result;
    private String PrescribedBy;
    private int count=0;
    
    public LabTestsPrescribedByDocotor() {
        count++;
        this.TestID= "T"+String.valueOf(count);
    }

    public String getTestName() {
        return TestName;
    }

    public void setTestName(String TestName) {
        this.TestName = TestName;
    }

    public String getPrescribedDate() {
        return PrescribedDate;
    }

    public void setPrescribedDate(String PrescribedDate) {
        this.PrescribedDate = PrescribedDate;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    public String getPrescribedBy() {
        return PrescribedBy;
    }

    public void setPrescribedBy(String PrescribedBy) {
        this.PrescribedBy = PrescribedBy;
    }

    public String getTestID() {
        return TestID;
    }

    public void setTestID(String SwabID) {
        this.TestID = SwabID;
    }
    
    
    
    
}
