/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author swapn
 */
public class Patient {
    
    private String patientID;
    private Encounter_History vitalSignHistory;
    
    public Patient() {
        this.vitalSignHistory = new Encounter_History();
    }
    
    public String getPatientID() {
        return patientID;
    }
    
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
    public Encounter_History getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public void setVitalSignHistory(Encounter_History vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.patientID);
    }
    
    
    
}
