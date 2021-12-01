/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AppointmentDetails;

/**
 *
 * @author swapn
 */
public class AppointmentHistory {
    private String PatientID;
    private AppointmentDirectory AppointmentHistory;

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public AppointmentDirectory getAppointmentHistory() {
        return AppointmentHistory;
    }

    public void setAppointmentHistory(AppointmentDirectory AppointmentHistory) {
        this.AppointmentHistory = AppointmentHistory;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.PatientID);
    }
    
}
