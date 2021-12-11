/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LogisticsAssociateRole;
import Business.Role.Role;
import Business.Role.SwabCollectorRole;
import java.util.ArrayList;

/**
 *
 * @author swapn
 */
public class LogisticsOrganization extends Organization{
    
    public LogisticsOrganization() {
        super(Organization.Type.LogisticsAssociate.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LogisticsAssociateRole());
        return roles;
    }
    
}
