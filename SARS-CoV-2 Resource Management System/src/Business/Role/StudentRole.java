/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.AppointmentDetails.AppointmentHistory;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.StudentRole.StudentWorkAreaJPanel;
import userinterface.TestingCenter.StudentUsher.StudentUsherWorkAreaJPanel;

/**
 *
 * @author swapn
 */
public class StudentRole extends Role{
    
    public AppointmentHistory ah;
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        this.ah = ah;
        return new StudentWorkAreaJPanel(userProcessContainer,account,business, dB4OUtil, ah);
    }
    
}
