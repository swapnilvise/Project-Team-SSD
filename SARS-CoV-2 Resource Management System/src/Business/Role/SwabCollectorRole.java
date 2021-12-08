/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Swab.SwabDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.TestingCenter.StudentUsher.StudentUsherWorkAreaJPanel;
import userinterface.TestingCenter.SwapCollectorRole.SwabCollectorWorkAreaJPanel;

/**
 *
 * @author swapn
 */
public class SwabCollectorRole extends Role{
    
    SwabDirectory sd;
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        return new SwabCollectorWorkAreaJPanel(userProcessContainer,account,business, dB4OUtil,sd);
    }  
    
}
