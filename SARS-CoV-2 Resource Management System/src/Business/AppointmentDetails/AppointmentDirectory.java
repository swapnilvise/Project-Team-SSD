/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AppointmentDetails;

import java.util.ArrayList;

/**
 *
 * @author swapn
 */
public class AppointmentDirectory {
    
    private ArrayList<AppointmentDetails> AppointmentList;

    public AppointmentDirectory() {
        AppointmentList = new ArrayList();
//        intialize();
    }

    public ArrayList<AppointmentDetails> getAppointmentList() {
        return AppointmentList;
    }
    
    public AppointmentDetails createAppointment(){
        AppointmentDetails ad = new AppointmentDetails();
//        ad.setAppointmentDate(Date);
//        ad.setAppointmentTime(Time);
        this.AppointmentList.add(ad);
        //Code to get complaiance status to be written
        return ad;
    }

    private void intialize() {
        AppointmentDetails ad = new AppointmentDetails();
        ad.setAppointmentDate("15 Dec");
        ad.setAppointmentTime("6 am");
        ad.setComplianceStatus("C");
        AppointmentList.add(ad);
    }
    
    
    
    
}
