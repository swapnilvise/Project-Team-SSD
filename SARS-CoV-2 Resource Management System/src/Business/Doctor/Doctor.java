/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Student.Student;
import Business.UserAccount.UserAccount;

/**
 *
 * @author swapn
 */
public class Doctor {
    private String DoctorLastName;
    private String DoctorFirstName;
    private String DoctorID;
    private UserAccount doctorAccount;
    private static int count = 0;
    
    public Doctor(){
        count++;
        this.DoctorID="D"+String.valueOf(count);
    }

    public String getDoctorLastName() {
        return DoctorLastName;
    }

    public void setDoctorLastName(String DoctorLastName) {
        this.DoctorLastName = DoctorLastName;
    }

    public String getDoctorFirstName() {
        return DoctorFirstName;
    }

    public void setDoctorFirstName(String DoctorFirstName) {
        this.DoctorFirstName = DoctorFirstName;
    }

    public String getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(String DoctorID) {
        this.DoctorID = DoctorID;
    }

    public UserAccount getDoctorAccount() {
        return doctorAccount;
    }

    public void setDoctorAccount(UserAccount doctorAccount) {
        this.doctorAccount = doctorAccount;
    }
    
    
    
    @Override
    public String toString(){
        return DoctorLastName;
    }
    
}
