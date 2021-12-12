/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Student.Student;
import Business.Swab.SwabDetails;
import java.util.HashMap;

/**
 *
 * @author swapn
 */
public class DoctorDirectory {
    
    private HashMap<String, Doctor> DoctorList;

    public DoctorDirectory() {
        this.DoctorList=new HashMap<>();
    }
    
    //Find customer using customer id
    public Doctor findDoctor(String DoctorID){
        Doctor dr = this.DoctorList.get(DoctorID);
        if(dr==null)
            return null;
        return dr;
    }

    public HashMap<String, Doctor> getDoctorList() {
        return DoctorList;
    }
    
    //Creating new customer
    public Doctor newDoctor(){
        Doctor dr = new Doctor();
        this.DoctorList.put(dr.getDoctorID(), dr);
        
        return this.DoctorList.get(dr.getDoctorID());
//        return c;
    }
    
    //Removing customer
    public void removeDoctor(String DoctorID){
        this.DoctorList.remove(this.DoctorList.get(DoctorID));
    }
    
    public Doctor findDoctorByUserName(String userName){
        
        for(String d: this.DoctorList.keySet()){
            if(this.DoctorList.get(d).getDoctorAccount().getUsername().equals(userName)){
                System.out.println("Not null");
                return this.DoctorList.get(d);
            }
        }
        return null;
    }
    
}
