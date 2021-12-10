/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

    
     
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,DB4OUtil dB4OUtil) {
        return new CustomerAreaJPanel(userProcessContainer, account, business, dB4OUtil);
    }
    
    
}
