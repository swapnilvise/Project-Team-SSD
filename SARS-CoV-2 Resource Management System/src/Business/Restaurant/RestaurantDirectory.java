/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;
import java.util.HashMap;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private HashMap<String,Restaurant> restDirectory;
    
    public RestaurantDirectory(){
        this.restDirectory= new HashMap<>();
    }
    
    public Restaurant findRestaurant(String restId){
        return this.restDirectory.get(restId);
    }

    public HashMap<String, Restaurant> getRestDirectory() {
        return restDirectory;
    }
    
    public Restaurant newRestaurant(UserAccount userAccount){
        Restaurant nr = new Restaurant();
        nr.setRestAdmin(userAccount);
        this.restDirectory.put(nr.getRestId(),nr);
        return nr;
    }
    
    public Restaurant findResttaurantByUserName(String userName){
        for (String s : this.restDirectory.keySet()) {
            if(this.restDirectory.get(s).getRestAdmin().getUsername().equals(userName))
                return this.restDirectory.get(s);
        }
        return null;
    }
    
    public Restaurant findResttaurantByName(String restName){
        for (String s : this.restDirectory.keySet()) {
            if(this.restDirectory.get(s).getRestName().equals(restName))
                return this.restDirectory.get(s);
        }
        return null;
    }
    
    public void removeRestaurant(String restId){
        this.restDirectory.remove(restId);
    }
    
}
