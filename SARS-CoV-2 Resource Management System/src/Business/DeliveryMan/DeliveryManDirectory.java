/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.HashMap;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
     private HashMap<String, DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        this.deliveryManList=new HashMap<>();
    }
    
    //Find delivery man using deliveryman id
    public DeliveryMan findDeliveryMan(String delID){
        DeliveryMan dm = this.deliveryManList.get(delID);
        if(dm==null)
            return null;
        return dm;
    }
    
    public DeliveryMan findDeliveryManByUserName(String userName){
        
        for(String s: this.deliveryManList.keySet()){
            if(this.deliveryManList.get(s).getDeliveryManAccount().getUsername().equals(userName)){
                return this.deliveryManList.get(s);
            }
        }
        return null;
    }

    public HashMap<String, DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }
    
    //Creating new delivery man
    public DeliveryMan newDeliveryMan(){
        DeliveryMan dm = new DeliveryMan();
        this.deliveryManList.put(dm.getDelId(), dm);
        return this.deliveryManList.get(dm.getDelId());
    }
    
    //Removing delivery man
    public void removeDeliveryMan(String delID){
        this.deliveryManList.remove(this.deliveryManList.get(delID));
    }
    
    
}
