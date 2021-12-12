/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Organization.Organization;

import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.StudentUsher.StudentUsherDirectory;
import Networks.Network;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem ecosystem;
    private ArrayList<Network> networks;
    private StudentUsherDirectory sud;

    public static EcoSystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new EcoSystem();
        }
        return ecosystem;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networks.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        networks = new ArrayList<Network>();
        this.sud = new StudentUsherDirectory();
    }

    public ArrayList<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(ArrayList<Network> networks) {
        this.networks = networks;
    }

    public StudentUsherDirectory getSud() {
        return sud;
    }

    public void setSud(StudentUsherDirectory sud) {
        this.sud = sud;
    }
    
    
}
