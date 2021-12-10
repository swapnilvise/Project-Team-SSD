/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.HashMap;

/**
 *
 * @author swapn
 */
public class Menu {
    
    private HashMap<String,Item> itemList;

    public Menu() {
        this.itemList = new HashMap<>();
    }

    public HashMap<String, Item> getItemList() {
        return itemList;
    }
    
    public Item addNewItem(){
        Item ni= new Item();
        this.itemList.put(ni.getItemId(), ni);
        return this.itemList.get(ni.getItemId());
    }
    
    public Item findItemByName(String itemName){
        for(String s : this.itemList.keySet()){
            if(itemName.equals(this.itemList.get(s).getItemName())){
                return this.itemList.get(s);
            }
        }
        return null;
    }
    
    public void removeItem(String itemId){
        this.itemList.remove(itemId);
    }
    
}
